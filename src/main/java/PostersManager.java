public class PostersManager {

    private MyPosters[] myArrayPosters = new MyPosters[0];
    private int countOut = 10;


    public PostersManager() {
    }

    public PostersManager(int myCount) {
        if (myCount > 0) {
            this.countOut = myCount;
        }
    }

    public void addMovie(MyPosters item) {
        MyPosters[] temp = new MyPosters[myArrayPosters.length + 1];
        System.arraycopy(myArrayPosters, 0, temp, 0, myArrayPosters.length);
        temp[temp.length - 1] = item;
        myArrayPosters = temp;
    }

    public MyPosters[] findAll() {
        return myArrayPosters;

    }

    public MyPosters[] findLast() {

        int myCountOut = 0;
        if (myArrayPosters.length < countOut) {
            myCountOut = myArrayPosters.length;
        } else {
            myCountOut = countOut;
        }
        MyPosters[] temp = new MyPosters[myCountOut];
        for (int i = 0; i < myCountOut; i++) {
            temp[i] = myArrayPosters[myArrayPosters.length - 1 - i];
        }
        return temp;
    }
}
