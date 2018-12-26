package com.ly.train.flower.common.sample;

import com.ly.train.flower.common.service.Service;

public class ServiceB implements Service {

  @Override
  public Object process(Object message) {
    if (message != null && message instanceof String) {
      return ((String) message).toUpperCase();
    }
    return "";
  }

}
