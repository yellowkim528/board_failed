package com.kh.Day8.modifier;
/*
    제어자 :
        1. 접근제어자(access modifier) : public, protected, default, private
            public : 다른패키지, 동일패키지, 같은 클래스
            protected : 다른패키지(상속관계가 있는), 동일패키지, 같은 클래스
            default : 동일패키지, 같은 클래스
            private : 같은 클래스
        2. static
        3. final
 */
public class Test1 {
    public static void main(String[] args) {

    }
    //접근 제한자 default
    public void method3() {

    }
    //접근 제한자 default
    protected void method4() {

    }
    //접근 제한자 default
    void method1() {

    }
    //접근 제한자 default
    private void method2() {

    }
}
