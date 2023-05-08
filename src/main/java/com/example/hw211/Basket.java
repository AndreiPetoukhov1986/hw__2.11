package com.example.hw211;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Component
@SessionScope
public class Basket {

  private final Set<Integer> ids = new HashSet<>();

  public void add(Set<Integer> ids) {
    this.ids.addAll(ids);
  }

  public Set<Integer> get() {
    return Collections.unmodifiableSet(ids);
  }

}
