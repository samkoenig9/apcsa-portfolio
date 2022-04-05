package src.Week3;

import java.util.ArrayList;

public class bubble extends sort {

    public bubble (ArrayList<Integer> data) {
        super.data = data;
    }

    @Override
    public void sort() {
        boolean change = true;

        for(;;) {
            for(int i = 0; i < this.data.size() - 1; i++) {
                change = false;
                if(this.data.get(i) > this.data.get(i + 1)) {
                    int temp = this.data.get(i);
                    this.data.set(i, this.data.get(i + 1));
                    this.data.set(i + 1, temp);
                    change = true;
                }
            }

            if (change == false) {
                break;
            }
        }
    }
}