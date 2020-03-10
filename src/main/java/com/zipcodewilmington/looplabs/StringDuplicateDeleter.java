package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String[] arr = array.clone();
        Integer currentCount = 1;
        Integer count = 0;
        String dups = "";
        if(maxNumberOfDuplications < 2){
            return new String[0];
        }
        for (int i = 0; i <arr.length ; i++) {
            currentCount = 0;
            count = 0;

            for (int j = i+1; j < arr.length-1 ; j++) {
                if(arr[i].equals(arr[j])){
                    currentCount++;
                    dups = arr[i];
                }
            }
            if(currentCount>=maxNumberOfDuplications){
                for (int k = 0; k <arr.length ; k++) {
                    if(dups.equals(arr[k])){
                        arr[k] = "blank";
                    }
                }
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            if(!(arr[i].equals("blank"))){
                count++;
            }
        }
        String[] temp = new String[count];
        Integer count2 = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(!(arr[i].equals("blank"))){
                temp[count2] = arr[i];
                count2++;
            }
        }
        return temp;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Integer counter =0;
        String test ="";
        Integer dupCount =0;
        String[] arr = array.clone();
        for (int i = 0; i <arr.length ; i++) {
            test = arr[i];
            dupCount=0;
            for (int j = 0; j <arr.length ; j++) {
                if (arr[j].equals(test)) {
                    dupCount++;
                }
            }
            if(dupCount==exactNumberOfDuplications){
                for (int j = 0; j <arr.length ; j++) {
                    if(arr[j].equals(test)){
                        arr[j]= "Blank";
                    }
                }
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            if(!arr[i].equals("Blank")){
                counter++;
            }
        }
        Integer counter2 =0;
        String[] answer = new String[counter];
        for (int i = 0; i <arr.length ; i++) {
            if(!arr[i].equals("Blank")){
                answer[counter2]=arr[i];
                counter2++;
            }
        }
        return answer;
    }
}
