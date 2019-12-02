package id.ac.polinema.dtsfit.generator;

import java.io.IOException;

import id.ac.polinema.dtsfit.services.AService;
import id.ac.polinema.dtsfit.services.BService;
import id.ac.polinema.dtsfit.services.CService;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static id.ac.polinema.dtsfit.Constant.BASE_URL;

public class ServiceGenerator {

    private static Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofit = builder.build();

    private static HttpLoggingInterceptor logging = new HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY);

    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

    private ServiceGenerator() {}

    public static <Service> Service createService(Class<Service> serviceClass) {
//        AService aService;
//        BService bService;
//        CService cService;
//
//        aService = ServiceGenerator.createService(AService.class);
//        bService = ServiceGenerator.createService(BService.class);
//        cService = ServiceGenerator.createService(CService.class);

        if (!httpClient.interceptors().contains(logging)) {
            httpClient.addInterceptor(logging);
        }
        builder.client(httpClient.build());
        retrofit = builder.build();
        return retrofit.create(serviceClass);
    }

}
