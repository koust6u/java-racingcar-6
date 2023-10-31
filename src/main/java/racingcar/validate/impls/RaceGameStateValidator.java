package racingcar.validate.impls;

import java.util.List;
import racingcar.validate.Validator;

public class RaceGameStateValidator implements Validator {


    @Override
    public void validate(Object obj) {

    }

    private boolean isValidNameLength(String name){
        return name.length() < 6 && name.length() != 0;
    }


    private boolean isUniqueNames(List<String> nameList){
        int originLength = nameList.size();
        int deleteDuplicateLength = nameList.stream().distinct().toList().size();
        return originLength == deleteDuplicateLength;
    }
}
