package TCS;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APICalling {


    public static void main(String[] args) throws IOException, InterruptedException {

          //Api call 0
        var url="https://api.github.com/users/Amityadav9315";

        var request= HttpRequest.newBuilder().GET().uri(URI.create(url)).build();


        var client = HttpClient.newBuilder().build();
        var response=client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.statusCode());
        System.out.println(response.body());


        //Api call 1
        var url1="https://api.rootnet.in/covid19-in/stats/latest";

        var request1= HttpRequest.newBuilder().GET().uri(URI.create(url1)).build();


        var client1 = HttpClient.newBuilder().build();
        var response1=client.send(request1, HttpResponse.BodyHandlers.ofString());

        System.out.println(response1.statusCode());
        System.out.println(response1.body());



        //Api call 2t

        var url2="https://api.rootnet.in/covid19-in/stats/testing/history";

        var request2= HttpRequest.newBuilder().GET().uri(URI.create(url2)).build();


        var client2 = HttpClient.newBuilder().build();
        var response2=client.send(request2, HttpResponse.BodyHandlers.ofString());

        System.out.println(response2.statusCode());
        System.out.println(response2.body());

    }
}
