import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class LineStorage {

        private ArrayList inputList = new ArrayList();
        private String currentWord;
        private String[] wordInLine;



        public void setChar(int lineNum, int wordPosition, int charPosition, char letter){
                //System.out.println("set char input list: " + inputList);
                String[] currentLine = new String[inputList.size()];

                currentLine[lineNum] =   (String) inputList.get(lineNum);

                String[] wordInLine = currentLine[lineNum].split("\\s+");



                currentWord = wordInLine[wordPosition];// (String) current_line.get(wordPosition);

                //  System.out.println("wordin line position: " + wordInLine[wordPosition]);
                char[] chars = currentWord.toCharArray();

                chars[charPosition] = letter;

                currentWord = new String(chars);

        }



        public void setWord(int lineNum, int wordPosition, String word){
                String[] currentLine = new String[inputList.size()];

                currentLine[lineNum] =   (String) inputList.get(lineNum);

                wordInLine = currentLine[lineNum].split("\\s+");


                wordInLine[wordPosition] = word;
                //System.out.println("set word in line storage: " + wordInLine[wordPosition]);

        }

        public String getWord(int lineNum, int wordPosition){
        //      String[] currentLine = new String[inputList.size()];

        //      currentLine[lineNum] =   (String) inputList.get(lineNum);

        //      String[] wordInLine = currentLine[lineNum].split("\\s+");

        //      System.out.println("get word in line storage: " + wordInLine[wordPosition]);

                return wordInLine[wordPosition];

        }


        public void setInputList(ArrayList inputList) {
                this.inputList = inputList;
        }

        public ArrayList getInputList() {
                return inputList;
        }

        public char getChar(int lineNum, int wordPosition, int charPosition) {
                //ArrayList     currentLine = (ArrayList) inputList.get(lineNum);

                //          String[] currentLine = new String[inputList.size()];
                //          currentLine[lineNum] =   inputList.get(lineNum);
                //
                //              String[] wordInLine = currentLine[lineNum].split("\\s+");

                //  currentWord = wordInLine[wordPosition];

                //      System.out.println("current word in get char: " + currentLine[wordPosition]);

                //System.out.println("current word in get char: " + currentWord);


                return currentWord.charAt(charPosition);

        }

//      public int getTotalWordCount() {
//              String [] words = inputList.toString().replace(",", "")  //remove the commas
//                              .replace("[", "")  //remove the right bracket
//                              .replace("]", "")  //remove the left bracket
//                              .trim().split("\\s+");//removing trailing spaces
//
//              return words.length;
//      }
//
//      public int getWordLength(int lineNum, int wordPosition) {
//              String [] words = ((String) inputList.get(lineNum)).replace(",", "")  //remove the commas
//                              .replace("[", "")  //remove the right bracket
//                              .replace("]", "")  //remove the left bracket
//                              .trim().split("\\s+");//removing trailing spaces
//
//              return  words[wordPosition].length();
//
//      }
//
//      public String getWordInLine(int lineNum, int wordPosition) {
//              String [] words = ((String) inputList.get(lineNum)).replace(",", "")  //remove the commas
//                              .replace("[", "")  //remove the right bracket
//                              .replace("]", "")  //remove the left bracket
//                              .trim().split("\\s+");//removing trailing spaces
//
//              return  words[wordPosition];
//      }
//      public int getWordCountOnLine(int lineNum) {
//
//              StringTokenizer tokenizer = null;
//
//              for(int i =0; i < inputList.size(); i++) {
//                      tokenizer = new StringTokenizer((String) inputList.get(lineNum));
//              }
//              return tokenizer.countTokens();
//
//
//      }

        public String[] getLine(int lineNum){
                String[] currentLine = new String[inputList.size()];

                currentLine[lineNum] =   (String) inputList.get(lineNum);

                String[] tmp = new String[currentLine.length];
                for(int i = 0; i < tmp.length; i++)
                        tmp[i] = currentLine[i];
                return tmp;
        }

        public int getLineCount(){
                return inputList.size();
        }




}