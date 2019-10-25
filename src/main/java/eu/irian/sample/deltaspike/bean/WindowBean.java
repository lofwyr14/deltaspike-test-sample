package eu.irian.sample.deltaspike.bean;

import org.apache.deltaspike.core.api.scope.WindowScoped;

import javax.inject.Named;
import java.io.Serializable;

@Named
@WindowScoped
public class WindowBean implements Serializable {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
