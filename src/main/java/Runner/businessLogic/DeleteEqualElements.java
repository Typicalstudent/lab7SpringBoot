package Runner.businessLogic;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeleteEqualElements {
    private static int index;
    private static int pos;
    private static Object tempObject;

    public DeleteEqualElements(List<Object> list) {
        index = list.size();
        index--;
        pos = 0;
        tempObject = new Object();
        tempObject = list.get(index);
    }


    interface Operationable {
        boolean calculate(List<Object> list, Object objToRemove);
    }

    public List<Object> skipNoRecurs(List<Object> list) {
        Operationable operation;
        operation = (x, y) -> {
            if (x.remove(y))
                return true;
            else
                return false;
        };
        while(index >-1) {
            while(operation.calculate(list, tempObject)) {
                index--;
            }
            list.add(list.size()-pos, tempObject);
            pos++;
            if (index > -1)
                tempObject = list.get(index);
        }
        return list;
    }

}

