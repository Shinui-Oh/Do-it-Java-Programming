# Chapter 05. 참조 자료형

# I. 배열

## 1. 배열

- 동일한 자료형을 묶어 저장한느 참조 자료형
- 생성할 때 크기 지정
- 한 번 크기를 지정하면 절대 변경할 수 없음

## 2. 배열 생성하기

### 1. 배열 선언하기

```java
자료형[] 변수명;

자료형 변수명[];
```

- 선언한 배열 자료형을 보자마자 어떤 타입을 묶은 것인지 알 수 있도록 첫번째 선언 권장
- 참조 자료형의 빈 공간 초기화 : null(널) 값

### 2. 힙 메모리에 배열의 객체 생성하기

```java
new 자료형[배열의 길이];
```

- 배열의 길이 반드시 지정

### 3. 배열 자료형 변수에 객체 대입하기

- 한 번에 변수 선언과 값의 대입
- 따로 구분 작성

```java
자료형[] 변수명 = new 자료형[배열의 길이];

자료형[] 변수명;
변수명 = new 자료형[배열의 길이];
```

### 4. 객체에 값 입력하기

- 인덱스 : 값을 저장할 수 있는 공간(번호)

```java
참조 변수명[인덱스] = 값;
```

```java
참조 변수명[인덱스]; // 배열 객체 값 읽어오기
```

## 3. 1차원 배열을 생성하는 다양한 방법

### 1. 배열 객체를 생성하고 값 대입하기

```java
자료형[] 참조 변수명 = new 자료형[배열의 길이];
참조 변수명[0] = 값;
참조 변수명[1] = 값;
...
참조 변수명[배열의 길이 - 1] = 값;
```

### 2. 배열 객체 생성과 함께 값 대입하기

```java
자료형[] 참조 변수명 = new 자료형[]{값, 값, ..., 값};
```

### 3. 대입할 값만 입력하기

```java
자료형[] 참조 변수명 = {값, 값, ..., 값};
```

## 4. 참조 변수와 배열 객체의 값 초기화하기

- 스택 메모리 변수를 초기화하지 않으면 해당 변수 출력 시 오류 발생
- 기본 자료형의 초기값(값), 참조 자료형의 초기값(null)

## 5. 참조 자료형으로서 배열의 특징

- 기본 자료형 : 스택 메모리에 실제 데이터값을 저장
- 참조 자료형 : 스택 메모리에 실제 데이터값이 아닌 힙 메모리에 저장된 객체의 위치를 저장

## 6. 반복문을 이용해 배열 데이터 읽기

### 1. 배열 참조 변수 이용

```java
배열 참조 변수.length
```

### 2. for-each

- 배열이나 컬렉션 등의 집합 객체에서 원소들을 하나씩 꺼내는 과정을 반복

```java
for(원소 자료형 변수명 : 집합 객체) {
}
```

### 3. toString() 정적 메서드

- 모든 배열의 원소 출력

```java
System.out.println(Arrays.toString(1차원 배열 참조 변수));
```

## 7. 2차원 정방 행렬 배열

- 가로 및 세로 방향의 2차원으로 데이터를 저장하는 배열
- 2개의 대괄호 사용

```java
자료형[][] 변수명

자료형 변수명[][]

자료형[] 변수명[]
```

- 메모리는 2차원 데이터를 바로 저장할 수 없음
- 2차원 배열은 1차원 배열을 원소로 포함하고 있는 1차원 배열

### 1. 배열 객체를 생성하고 값 대입하기

```java
자료형[][] 참조 변수명 = new 자료형[행의 길이][열의 길이];
참조 변수명[0][0] = 값;
참조 변수명[0][1] = 값;
...
참조 변수명[행의 길이 - 1][열의 길이 - 1] = 값;
```

### 2. 배열 객체의 행 성분부터 생성하고 열 성분 생성하기

```java
자료형[][] 참조 변수명 = new 자료형[행의 길이][];
참조 변수명[0] = 1차원 배열의 생성;
참조 변수명[1] = 1차원 배열의 생성;
...
참조 변수명[행의 길이 - 1] = 1차원 배열의 생성;
```

### 3. 배열의 자료형과 함께 대입할 값 입력하기

```java
자료형[][] 참조 변수명 = new 자료형[][]{{값, 값, ..., 값}, ..., {값, 값, ..., 값}};
```

### 4. 대입할 값만 입력하기

```java
자료형[][] 참조 변수명 = {{값, 값, ..., 값}, ..., {값, 값, ..., 값}};
```

## 8. 2차원 비정방 행렬 배열

- 각 행마다 열의 길이가 다른 2차원 배열
- 기본적인 개념은 2차원 정방 행렬과 완벽하게 동일
- 배열의 길이 주의하기

### 1. 배열 객체의 행 성분부터 생성하고 열 성분 생성하기

```java
자료형[][] 참조 변수명 = new 자료형[행의 길이][];
참조 변수명[0] = 1차원 배열의 생성;
참조 변수명[1] = 1차원 배열의 생성;
...
참조 변수명[행의 길이 - 1] = 1차원 배열의 생성;
```

### 2. 자료형과 대입할 값만 입력하기

```java
자료형[][] 참조 변수명 = new 자료형[][]{{값, 값, ..., 값}, ..., {값, 값, ..., 값}};
```

### 3. 대입할 값만 입력하기

```java
자료형[][] 참조 변수명 = {{값, 값, ..., 값}, ..., {값, 값, ..., 값}};
```

## 9. 2차원 배열의 출력

- 가로, 세로 방향으로 데이터 분포(2개의 인덱스 사용)
- 기본적으로 이중 for 문 사용
- 바깥쪽 for 문에는 행의 개수(a.length), 안쪽 for 문에는 열의 개수(a[i].length) 사용
    
    ```java
    int[][] a = {{값, 값, 값}, {값, 값, 값}};
    
    for(int i = 0; i < a.length; ++i) {
    	for(int j = 0; j < a[i].length; ++j) {
    		System.out.println(a[i][j]);
    	}
    }
    ```
    
    ```java
    int[][] a = {{값, 값, 값}, {값, 값, 값}};
    
    for(int[] m : a) {
    	for(int n  : m) {
    		System.out.println(n);
    	}
    }
    ```
    

## 10. main() 메서드의 입력매개변수

```java
public static void main(String[] args) {
}
```

- 자바 가상 머신에서 main() 메서드 실행
- 필요한 자료를 배열 타입으로 넘겨 줄 수 있음

### 1. 타입 변환 메서드

- 문자열 → 정수 : Integer.parseInt(문자열)
- 문자열 → 실수 : Double.parseDouble(문자열)
- 정수 → 문자열 : String.valueOf(정수)
- 실수 → 문자열 : String.valueOf(실수)

# II. 문자열을 저장하는 String

## 1. 문자열의 표현과 객체 생성

### 1. new 키워드를 사용하여 문자열 입력

```java
String 참조 변수명 = new String("문자열");
```

### 2. 문자열 값(문자열 리터럴)만 입력

```java
String 참조 변수명 = "문자열";
```

## 2. String 클래스의 2가지 특징

### 1. 한 번 정의된 문자열은 변경할 수 없음

- 문자열 내용 변경 시 새로운 문자열을 포함하는 객체를 생성하여 사용, 기존의 객체는 버림

### 2. 문자열 리터럴을 바로 입력해 객체를 생성할 때 같은 문자열끼리 객체 공유

- 하나의 문자열을 여러 객체가 공유할 수 있음(메모리 효율성 증가)
- new로 생성 시 동일한 문자열 객체가 힙 메모리에 없더라도 새롭게 객체 생성
- 문자열 리터럴로 생성 시 힙 메모리에 동일한 문자열 객체가 있으면 그 객체 공유

## 3. String 객체의 ‘+’ 연산

- 연결하기(더하기의 의미가 아님)

### 1. ‘문자열 + 문자열’ 연산

- 입력 그대로 문자열을 연결한 결과가 리턴

### 2. ‘문자열 + 기본 자료형’ 또는 ‘기본 자료형 + 문자열’ 연산

- 모든 연산은 동일한 자료형끼리만 가능
- 기본 자료형과 문자열을 연산하기 위해서는 기본 자료형을 문자열로 변경, 이후 문자열 + 문자열 연산 수행

## 4. String 클래스의 주요 메서드

- length() : 문자열의 길이 리턴
- charAt() : 문자열에서 특정 인덱스에 위치해 있는 문자를 알아냄
- indexOf() : 문자열에서 특정 문자나 특정 문자열을 앞에서부터 찾아 위치값을 알아냄
- lastIndexOf() : 문자열에서 특정 문자나 특정 문자열을 뒤에서부터 찾아 위치값을 알아냄
- String.valueOf() : 기본 자료형을 문자열로 바꾸는 정적 메서드
- concat() : 2개의 문자열을 연결, + 연산자와 동일한 기능 수행
- getBytes() : 문자열을 byte 배열로 변환, 자바 입출력 과정에서 주로 사용
- toCharArray() : 문자열을 char 배열로 변환, 자바 입출력 과정에서 주로 사용
- toLowerCase() : 영문 문자를 모두 소문자로 변환
- toUpperCase() : 영문 문자를 모두 대문자로 변환
- replace() : 일부 문자열을 다른 문자열로 대체
- substring() : 문자열의 일부만을 포함하는 새로운 문자열 객체 생성
- split() : 특정 기호를 기준으로 문자열 분리
- trim() : 문자열의 좌우 공백 제거
- equals() : 두 문자열의 위치값이 아닌 실제 데이터값 비교, 대소문자 구분
- equalsIgnoreCase() : 두 문자열의 위치값이 아닌 실제 데이터값 비교, 대소문자 구분 X
