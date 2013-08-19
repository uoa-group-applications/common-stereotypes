package nz.ac.auckland.common.stereotypes;

import javax.inject.Inject;

@UniversityComponent
public class Service1 {

  @Inject
  private Service2 service2;

  public Service2 getService2() { return service2; }
}
