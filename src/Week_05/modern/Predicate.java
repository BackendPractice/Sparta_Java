package Week_05.modern;


// 함수형 인터페이스 : 함수를 인자로 전달할때 타입으로 사용됨
interface Predicate<T> {
    boolean test(T t);
}
