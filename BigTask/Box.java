package BigTask;

import java.util.ArrayList;
import java.util.List;

public class  Box <T extends Fruit>{
    private  float sizeWeightBox;
    private List<T> box;

    public  void main(String[] args) {

    }

    public Box() {
        this.box = new ArrayList<>();
    }

    private boolean compare(Box<?> another){
        return Math.abs(this.getWeight() - another.getWeight())<0.000001;

    }
    private float getWeight(){
        for (T fruits : box) {
            sizeWeightBox += fruits.getWeight();
        }
        return sizeWeightBox;
    }
    private void pourOver(Box<? super T>secondBox){
        secondBox.box.addAll(this.box);
    }
    private void add(T fruit){
        box.add(fruit);
    }

}

