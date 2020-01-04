package correct_filepac;

import correct_filepac.interfaces.Counter;

import java.util.ArrayList;

public class CounterImpl implements Counter {

    @Override
    public long countSum(String content) throws Exception {
        ArrayList<Long> longs = new ArrayList<>();
        String trimStr = content.replace(" ", "").trim();

        for (int i = 0; i < trimStr.length(); i++) {
            String oneStr = trimStr.substring(i, i + 1);
            longs.add(Long.parseLong(oneStr));
        }

        long sum = 0;
        for (Long l : longs) {
            sum += l;
        }

        return sum;
    }
}
