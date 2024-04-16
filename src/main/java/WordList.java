import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    String t = new String();
    int num = 0;
    for(int i = 0; i < myList.size(); i++){
      t = myList.get(i);
      if(t.length() == len)
        num++;
    }
    return num;
  }

  public void removeWordsOfLength(int len)
  {
    for(int i = 0; i < myList.size(); i++){
      if(myList.get(i).length()==len){
        myList.remove(i);
        i--;
      }
  }
    return myList;
}
