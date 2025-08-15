import java.util.*;

public class DatabaseQuerySimulator {
  public static List<Map<String , String>> getOpenCases(List<Map<String , String>> cases){
    List<Map<String , String>> openCases = new ArrayList<>();
    for(Map<String , String> caseDetails : cases){
      if("open".equalsIgnoreCase(caseDetails.get("Status"))){
        openCases.add(caseDetails);
      }
    }
    return openCases;
  }
  
  public static void main(String[] args) {
    List<Map<String , String>> casesList = new ArrayList<>();

    //Created the 5 sample cases 
    Map<String , String> case1 = new HashMap<>();
    case1.put("Id:","1");
    case1.put("Title:", "Civil Case");
    case1.put("Status", "open");

    Map<String , String> case2 = new HashMap<>();
    case2.put("Id:","2");
    case2.put("Title:", "Criminal Case");
    case2.put("Status", "Open");

    Map<String , String> case3 = new HashMap<>();
    case3.put("Id:","3");
    case3.put("Title:", "Murder Case");
    case3.put("Status", "close");

    Map<String , String> case4 = new HashMap<>();
    case4.put("Id:","4");
    case4.put("Title:", "Property dispute Case");
    case4.put("Status", "Close");

    Map<String , String> case5 = new HashMap<>();
    case5.put("Id:","5");
    case5.put("Title:", "Theft Case");
    case5.put("Status", "open");

    //Add the cases to the list
    casesList.add(case1);
    casesList.add(case2);
    casesList.add(case3);
    casesList.add(case4);
    casesList.add(case5);
    //List to store the result whose status = open
    List<Map<String , String>> openCases = getOpenCases(casesList);
    System.out.println(openCases);
  } 
}
