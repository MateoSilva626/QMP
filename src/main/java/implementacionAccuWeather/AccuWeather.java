package implementacionAccuWeather;

//ESTO NO SE USA (POR AHI DESPUES SI) DEJAR, AHORA NO SIRVE IGUAL

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public interface AccuWeather {


//TODO

  @Headers("apikey: VsA9msDQDUGLJZ3vMMAHOb6mZ6rwEeU4")
  @GET("distancia")
  Call<List<Map<String, Object>>> pronostico12hs();

  @Headers("apikey: VsA9msDQDUGLJZ3vMMAHOb6mZ6rwEeU4")
  @GET("distancia")
  Call<List<Map<String, Object>>> pronostico12hs2(@Query("apikey") String apikey,
                                                  @Query("language") String language,
                                                  @Query("details") int details,
                                                  @Query("metric") int metric);

}
