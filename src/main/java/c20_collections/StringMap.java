package c20_collections;

import java.util.*;

/*
    Map
        특징 :
            - 데이터를 키 - 값 생(Key = Value Pair)으로 저장합니다.
            - 키는 중복을 허용하지 않으며, 값은 중복이 가능합니다. -> JSON이라는 형태와 가장 유사하기 때문에

        구현체 :
            1) HashMap - 순서를 유지하지 않습니다.
            2) LinkedHashMap - 입력된 순서를 유지합니다.
            3) TreeMap - 키를 자동으로 정렬합니다.
 */
public class StringMap {
    public static void main(String[] args) {

        // HashMap 생성 및 초기화 -> Key의 Value가 들어가기 때문에 제네릭으로 두 개의 타입을 설정할 필요가 있음
        Map<String, String> map = new HashMap<>();

        // Map에 데이터 삽입하는 방법 -> .put(키, 값)
        /*
            위의 메서드를 확용합니다(참고 .put() 인스턴스 메서드입니다).
              키  값
            1332 이하온
            1333 이하순
            1334 이하중
            1335 이하남
            1336 이하북

            입력이 끝나셨으면 출력해보세요. - List 출력 방법과 동일합니다.
         */
        map.put("1332", "이하온");
        map.put("1333", "이하순");
        map.put("1334", "이하중");
        map.put("1335", "이하남");
        map.put("1336", "이하북");

        System.out.println("map 전체 출력 : " + map);

        // 특정 키의 값 조회 -> .get() 사용 -> 값이 출력됨
        System.out.println(map.get("1332"));            // 츨력값 -> "이하온"

        // 특정 키의 값 수정 1 -> .put()을 통해 덮어쓰기를 해야합니다.
        // 1335의 키를 가진 값을 이하동으로 바꾼다고 가정하겠습니다.
        map.put("1335", "이하동");
        System.out.println("수정 1 후 map 출력 : " + map);

        // 특정 키의 값 수정 2 -> .replace()를 사용
        map.replace("1335", "이하동");
        System.out.println("수정 2 후 map 출력 : " + map);

        // 특정 키의 존재 여부 확인 -> .containsKey() 메서드 사용
        boolean searchSuccessFlag1 = map.containsKey("1333");
        boolean searchSuccessFlag2 = map.containsKey("1338");
        System.out.println(searchSuccessFlag1);
        System.out.println(searchSuccessFlag2);

        // 특정 값 존재 여부 확인 -> .containsValue() 메서드 사용
        boolean searchSuccessFlag3 = map.containsValue("이하서");
        System.out.println(searchSuccessFlag3);

        // map의 엔트리(Key - Value 동시에 지칭하는 개념)로부터 List 생성
        Set<Map.Entry<String, String>> entry = map.entrySet();
        System.out.println("map을 Set 형태로 전환 : " + entry);
        // 비어있는 List를 생성
        List<Map.Entry<String, String>> entries = new ArrayList<>();
        System.out.println(entries);        // 여기에는 비어있는 entries List만 출력됨
        // Set에서 List로 전환 -> 추후 가장 중요한 개념 중 하나입니다.
        entries.addAll(entry);

        System.out.println("entry 리스트 출력 : " + entries);
        System.out.println(entries.get(0));

        // Key들을 모아둔 Set 출력
        // 1) Set 선언 및 초기화
        // 자료형<Key자료형> 변수명 = 맵이름.keySet();
            Set<String> keySet = map.keySet();
        // 2) 출력
        System.out.println("Key 목록 Set : " + keySet);
        // 3) 이거 List로 바꿔서 순서 정렬해보세요. 리스트명 keyList
        List<String> keyList = new ArrayList<>();
        keyList.addAll(keySet);
        System.out.println(keyList);
        Collections.sort(keyList);
        System.out.println(keyList);

        // Value 컬렉션 출력 -> <> 내부에 Value의 자료형 넣으셔야 합니다.
        Collection<String> values = map.values();
        System.out.println("values 들 : " + values);
        System.out.println(values.getClass());  // List나 Set이 아니라 Values라는 클래스에 해당함.

        /*
            students 패키지 내에 StudentSet, StudentMap 만드시고, 각자 main적용
         */
    }
}
