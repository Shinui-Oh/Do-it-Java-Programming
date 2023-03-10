# Chapter 06. 클래스 외부 구성 요소

# I. Package와 Import

## 1. Package(패키지)

- 비슷한 목적으로 생성된 클래스 파일들을 한곳에 모아 둔 폴더
- 1개의 프로젝트에 1개의 패키지를 생성할 수도 있고 여러 개의 패키지를 생성할 수도 있음
- 패키지의 영향으로 클래스가 저장되는 공간이 분리됨
- 클래스명의 충돌을 방지할 수 있음
    
    ```java
    package 패키지명;
    ```
    

## 2. Import(임포트)

- 다른 패키지 내의 클래스를 사용하기 위한 문법 요소
- 소스 코드상 패키지 구문의 다음 줄에 위치
- 일반적으로 자신의 패키지 내부에 위치한 클래스만 프로그램이 동작할 때 사용

### 1. 클래스의 풀네임 사용

```java
패키지명.클래스명;
```

- 사용할 때마다 클래스의 풀네임을 표현하는 것은 비효율적

### 2. Import 사용

```java
import 패키지명.클래스명;
```

- 패키지 내의 모든 클래스를 임포트 하기 위해 * 사용

# II. 외부 클래스

## 1. 외부 클래스(External Class)

- 클래스의 외부에 추가로 정의한 클래스
- 1개의 소스 파일 안에서 public 클래스를 제외한 모든 클래스는 외부 클래스
- 외부 클래스는 같은 패키지 안에서만 사용 가능
- public class가 아니면 다른 패키지에서 Import 할 수 없음
    
    ```java
    package com.llouis;
    
    class ABC { // 다른 패키지에서 임포트 불가능
    	...
    }
    
    public class DEF { // 다른 패키지에서 임포트 가능
    	...
    }
    ```
