public class CircularShift {


        public void setup(LineStorage lineStorage) {
                String[] shiftedWords;

        //      shiftedWords = new String[lineStorage.getInputList().size()];

                //lineStorage.getInputList().get(i).toString().length()

                for(int i = 0; i < lineStorage.getLineCount(); i++){
        //              System.out.println("shift test" + lineStorage.getLine(i));
//                      System.arraycopy(lineStorage.getLine(i), 1 , shiftedWords, 0,  (ArrayList) lineStorage.getInputList().get(i).toString().length() -1);
//                      System.arraycopy(lineStorage.getLine(i), 0 , shiftedWords, lineStorage.getInputList().get(i).toString().length() -1, 1);
                }



        System.out.println("input list: " + lineStorage.getInputList());
        System.out.println("get shift line: " + lineStorage.getWord(0, 0));


     

              //          shifts_.addWord(line[k % line.length], shifts_.getLineCount() - 1); (chars, int)


        //      System.out.println("get char:" + lineStorage.getChar(1, 0, 0));
        //      String shiftedSentence = String.join(" ", shiftedWords);
                //System.out.println("get word: " +     lineStorage.getWord(0, 0));


                //System.out.println("shifted sentence in circular shift:" + shiftedSentence);

        }

}
