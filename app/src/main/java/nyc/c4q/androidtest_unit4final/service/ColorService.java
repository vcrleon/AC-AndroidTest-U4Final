package nyc.c4q.androidtest_unit4final.service;


import java.util.List;
import java.util.Map;

import nyc.c4q.androidtest_unit4final.model.Colors;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by c4q on 1/10/18.
 */

public interface ColorService {
    @POST("operable/cog/master/priv/css-color-names.json")
    Call<Map<String, String>> getColors();


}
