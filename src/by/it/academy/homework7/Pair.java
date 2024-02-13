package by.it.academy.homework7;

public class Pair<T> {

        private T firstElement;
        private T secondElement;

        public Pair(T firstElement, T secondElement) {
            this.firstElement = firstElement;
            this.secondElement = secondElement;
        }

        public T getFirstElement() {
            return firstElement;
        }

        public T getSecondElement() {
            return secondElement;
        }


        public void replaceFirst(T newFirstElement){
            firstElement = newFirstElement;
        }

        public void replaceSecond(T newSecondElement){
            secondElement = newSecondElement;
        }

        public void swap() {
            T temp = firstElement;
            firstElement = (T) secondElement;
            secondElement = (T) temp;
        }

}
