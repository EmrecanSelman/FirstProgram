package Music;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//
public class MusicModelList extends ArrayList<MusicModel> {//Burada extend ettik, sadece bir lsite kullanmamak için listeden ectend ettik.

    //bunun adı pollimorphism kalıtım
    public MusicModel getMusicWithIndex(int index) {
        Optional<MusicModel> first = stream().filter(m -> m.index == index).findFirst();//bura da stream methodlarını kullandık. araştır. Java8 streams.
        //straem parelel çalışan aramalar yapar hızlıdır. biz burada filter ile arama yaptık, arama sonucunda findfirst ile ilk degeri bulduk
        //eger ilk deger sonucu varsa getir dedik yoksa da ilk degeri koy. orElseget ile bunu sağladık
        return first.orElseGet(() -> get(0));
    }

    public List<MusicModel> getMusicWithLowerDuration(int duration) {
        return stream().filter(m -> m.durationSecond <= duration).collect(Collectors.toList());
    }
    public MusicModel getMusicRandom() {
        return stream().findAny().get();
    }
}
