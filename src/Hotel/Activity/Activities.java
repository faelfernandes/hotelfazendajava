package Hotel.Activity;

import Hotel.Activity.Contracts.ActivityInterface;
import Hotel.Activity.TypesActivities.Fishing;
import Hotel.Activity.TypesActivities.HorseRide;
import Hotel.Activity.TypesActivities.WalkWithInstructor;

public enum Activities {

  PASSEIO_A_CAVALO(new HorseRide()),
  CAMINHADA_COM_INSTRUTOR(new WalkWithInstructor()),
  PESCARIA(new Fishing());

  private ActivityInterface activity;

  Activities(ActivityInterface activity) {
    this.activity = activity;
  }

  public ActivityInterface getActivity() {
    return activity;
  }

}
