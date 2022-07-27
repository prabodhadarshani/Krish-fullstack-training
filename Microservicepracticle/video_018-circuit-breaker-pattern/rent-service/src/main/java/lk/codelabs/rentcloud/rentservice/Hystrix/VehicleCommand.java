package lk.codelabs.rentcloud.rentservice.Hystrix;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import lk.codelabs.rentcloud.model.vehicle.Vehicle;
import org.springframework.web.client.RestTemplate;

public class VehicleCommand extends HystrixCommand<Vehicle> {

    RestTemplate restTemplate;
    int vehicleId;

      public VehicleCommand(RestTemplate restTemplate , int vehicleId){

              super(HystrixCommandGroupKey.Factory.asKey("defalut"));

          this.restTemplate=restTemplate;
          this.vehicleId=vehicleId;
      }




    @Override
    protected Vehicle run() throws Exception {
        return restTemplate.getForObject("http://vehicle/services/vehicles/"+vehicleId,Vehicle.class);

    }
    @Override
    protected Vehicle getFallback() {
          System.out.println("its works");
        return new Vehicle();
    }
}
