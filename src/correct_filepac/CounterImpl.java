package correct_filepac;

import correct_filepac.interfaces.Counter;

import java.util.ArrayList;

public class CounterImpl implements Counter {

    @Override
    public long countSum(String content) throws Exception {
        ArrayList<Long> longs = new ArrayList<>();
        String[] strArr = content.trim().split(" ");

        for (int i = 0; i < strArr.length; i++) {
            longs.add(Long.parseLong(strArr[i]));
        }

        long sum = 0;
        for (Long l : longs) {
            sum += l;
        }

        return sum;
    }
}
