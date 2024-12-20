package c21_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

/*
    JSON(JavaScript Object Notation) : 본래 자바스크립트 언어로부터 파생되어 자바스크립트 구문을 따르지만,

    프로그래밍 언어나 플랫폼에 독립적이기 때문에 구문 분석 의 JSON 데이터 생성을 위한 코드는
 */
public class JSON01 {
    public static void main(String[] args) {
        // jsonObject를 생성하고 속성(엔트리)(키 - 값 쌍)을 추가(addProperty() 메서드 사용)
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("username", "haon");
        jsonObject.addProperty("password", "*****");
        jsonObject.addProperty("email", "global3556@naver.com");
        jsonObject.addProperty("name", "이하온");
        jsonObject.addProperty("age", "14");

        System.out.println(jsonObject);

        // prettyPrinting이 활성화된 Gson 인스턴스 생성
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        // prettyPrinting : 콘솔창에서 사람이 알아볼 수 있도록 정렬시켜둔 형태로 출력하는 방식

        // jsonObject를 prettyPrinting이 적용된 JSON 문자열로 반환
        String json = gson.toJson(jsonObject);  // String 자료형인 것에 주목해야 합니다.
        System.out.println(json);
        /*
            Gson 라이브러리 :
                목적 : Gson 라이브러리는 Java 객체를 JSON 형태롤 변환하거나, 그 반대로 변환하는 데 사용
                주요 클래스 :
                    Gson : 반환을 위해 사용되는 주요 클래스
                    GsonBuilder : Gson 인스턴스에 대한 사용자 정의 구성을 허용 -> 그래서 prettyPrinting
                    JsonObject : JSON 객체를 나타난 (즉, Java에서 사용)

                    JSON02.java 만들어 주세요.
         */
    }
}
