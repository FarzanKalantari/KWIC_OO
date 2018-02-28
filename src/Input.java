import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Input {
        //      private ArrayList inputList = new ArrayList();
        private int lineCounter;
        private ArrayList sentenceList = new ArrayList();
        String[] words;
        String[][] wordsInLine ; //[lineNum][wordPos]
        public LineStorage lineStorage = new LineStorage();

        public void read(String file) throws IOException {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                lineCounter = 0;

                String line;
                while((line  = reader.readLine()) != null){
                        if(!line.equals("")){
                                //lineStorage.inputList.add(line);

                                sentenceList.add(line);

                                lineCounter++;

                        }
                        System.out.println("line from read:" + line);

                }
                //lineStorage.setInputList(sentenceList);

                //              for(int j = 0; j < lineStorage.getInputList().size(); j++) {
                //
                //              System.out.println("line storage list: " + lineStorage.getInputList().get(j));
                //
                //                      }


        }

        public void store(LineStorage lineStorage) {

                lineStorage.setInputList(sentenceList);

                StringTokenizer tokenizer = null;
                //System.out.println("input list size:" + lineStorage.getInputList().size());


                for(int i =0; i < sentenceList.size(); i++) {
                        tokenizer = new StringTokenizer(sentenceList.toString().trim(),"[],");

                }

//                while(tokenizer.hasMoreTokens()) {
//                        System.out.println("token list:" + tokenizer.nextToken());
//                }

                words = sentenceList.toString().replace(",", "")  //remove the commas
                                .replace("[", "")  //remove the right bracket
                                .replace("]", "")  //remove the left bracket
                                .trim().split("\\s+");//removing trailing spaces


//              for(int i =0; i < sentenceList.size(); i++) {
//                      for(int j = 0; j < words.length; j++) {
////                            words = (sentenceList.get(i).toString()).replace(",", "")  //remove the commas
////                                            .replace("[", "")  //remove the right bracket
////                                            .replace("]", "")  //remove the left bracket
////                                            .trim().split("\\s+");//removing trailing spaces
//                              System.out.println("words:" + words[j]);
//
//                              wordsInLine[i][j] = words[j];
//                      }
//              }

        lineStorage.setWord(0, 0, "test");

        //System.out.println("get word: " +     lineStorage.getWord(0, 0));


//              System.out.println("line counter:" +  lineStorage.getLineCount());
//                              for(int i = 0; i < lineStorage.getLineCount(); i++) {
//                                      //for(int j = 0; j < lineStorage.getWordCountOnLine(i); j++) { //words.length  needs to be number of words in a line
//                                      for(int j = 0; j < lineStorage.getTotalWordCount(); j++) { //words.length  needs to be number of words in a line
//
//                                              //for(int k = 0; k < sentenceList.get(i).toString().length(); ++k) {  //length of one word of line
//                                              for(int k = 0; k < words[j].length(); k++) {  //length of one word of line
//                                                      //      System.out.println( " i: " + i + " j: " + j + " k: " + k);
//
//                                                      //    System.out.println(i +"i." + "word count on ith line: " + lineStorage.getWordCountOnLine(i));
//                                                      //      System.out.println(j + "j." + "length of  " + "'"+ words[j] + "'" + " is " + words[j].length() );
//                                                      System.out.println(k+"k. " + words[j].charAt(k));
//                                                      //System.out.println(k+". " + sentenceList.get(i).toString().charAt(k));
//                                                      //      lineStorage.setChar(i, j, k, words[j].charAt(k));
//                                                      System.out.println("line storage get char " + lineStorage.getChar(i, j, k));
//                                              }
//
//                                      }
//                              }



//              for(int i = 0; i < lineStorage.getLineCount(); i++) {
//                      //for(int j = 0; j < lineStorage.getWordCountOnLine(i); j++) { //words.length  needs to be number of words in a line
//                      for(int j = 0; j < lineStorage.getWordCountOnLine(i); j++) { //words.length  needs to be number of words in a line
//
//                              //for(int k = 0; k < sentenceList.get(i).toString().length(); ++k) {  //length of one word of line
//                              for(int k = 0; k < lineStorage.getWordLength(i,j); k++) {  //length of one word of line
//                                      //      System.out.println( " i: " + i + " j: " + j + " k: " + k);
//
//                                      //    System.out.println(i +"i." + "word count on ith line: " + lineStorage.getWordCountOnLine(i));
//                                      //      System.out.println(j + "j." + "length of  " + "'"+ words[j] + "'" + " is " + words[j].length() );
//                      //              System.out.println(k+"k. " + lineStorage.getWordInLine(i, j).charAt(k));
//                                      //System.out.println(k+". " + sentenceList.get(i).toString().charAt(k));
//                              //       System.out.println("check: " + ( ( sentenceList.get(i).toString().toCharArray()));
//                              //      lineStorage.setChar(i, j, k, words[j].charAt(k));
//                              //      System.out.println("line storage get char " + lineStorage.getChar(i, j, k));
//                              }
//
//                      }
//              }


        }

}