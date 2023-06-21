package Week_02;


import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String CollectionName = sc.next();
        String title = sc.next();
        sc.nextLine(); // 개행 문자 소비

        switch (CollectionName) {
            case "List":
                // ArrayList 선언 + 생성
                ArrayList<String> strList = new ArrayList<>();
                // text 한줄씩 받기
                while(true) {
                    String text = sc.nextLine();
                    if (Objects.equals(text, "끝")) {
                        break;
                    }
                    strList.add(text);
                }

                title = "[ List로 저장된 " + title + " ]";
                System.out.println(title);

                // text 한줄씩 출력하기
                for (int index=0; index < strList.size(); index++) {
                    int number = index + 1;
                    System.out.println(number + ". " + strList.get(index));
                }
                break;

            case "Map":
                // Map 선언 + 생성
                Map<Integer, String> strMap = new HashMap<>();
                int lineNumber = 1;

                // text 한줄씩 받기
                while(true) {
                    String text = sc.nextLine();
                    if (Objects.equals(text, "끝")) {
                        break;
                    }
                    strMap.put(lineNumber++, text);
                }

                title = "[ Map으로 저장된 " + title + " ]";
                System.out.println(title);

                // text 한줄씩 출력하기
                for (int index=0; index < strMap.size(); index++) {
                    int number = index + 1;
                    System.out.println(number + ". " + strMap.get(number));
                }
                break;

            case "Set":
                // Set 선언 + 생성
                LinkedHashSet<String> strSet = new LinkedHashSet<>();

                // text 한줄씩 받기
                while(true) {
                    String text = sc.nextLine();
                    if (Objects.equals(text, "끝")) {
                        break;
                    }
                    strSet.add(text);
                }

                title = "[ Set으로 저장된 " + title + " ]";
                System.out.println(title);

                // text 한줄씩 출력하기
                Iterator iterator = strSet.iterator();  // Set의 요소를 순회
                for (int index=0; index < strSet.size(); index++) {
                    int number = index + 1;
                    System.out.println(number + ". " + iterator.next());
                }
                break;

            default:
                System.out.println("저장할 수 없는 자료구조 입니다.");
    }
}}
