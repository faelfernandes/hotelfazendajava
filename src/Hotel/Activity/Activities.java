package Hotel.Activity;

import Hotel.Activity.Contracts.ActivityInterface;
import Hotel.Activity.TypesActivities.Fishing;
import Hotel.Activity.TypesActivities.HorseRide;
import Hotel.Activity.TypesActivities.WalkWithInstructor;

public enum Activities {

  PASSEIO_A_CAVALO(new HorseRide()),
  CAMINHADA_COM_INSTRUTOR(new WalkWithInstructor()),
  PESCARIA(new Fishing());

  private ActivityInterface atividade;

  Activities(ActivityInterface atividade) {
    this.atividade = atividade;
  }

  public ActivityInterface getAtividade() {
    return atividade;
  }

}
