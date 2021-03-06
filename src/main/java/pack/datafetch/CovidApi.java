package pack.datafetch;


import pack.datafetch.model.CountryData;
import pack.datafetch.model.GlobalData;
import retrofit2.Call;
import retrofit2.http.GET;

import retrofit2.http.Path;

public interface CovidApi {
    @GET("https://coronavirus-19-api.herokuapp.com/all")
    Call<GlobalData> getGlobalData();

    @GET("https://coronavirus-19-api.herokuapp.com/countries/{countryName}")

    Call<CountryData> getCountryData(@Path(value="countryName" ) String countryName);

}
