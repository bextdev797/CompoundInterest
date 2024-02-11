package com.brandonang.compoundinterest;

import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.YailList;

public class CompoundInterest extends AndroidNonvisibleComponent {

  public CompoundInterest(ComponentContainer container) {
    super(container.$form());
  }

  @SimpleFunction(description = "Calculate Compound Interest.")
    public void CalculateCompoundInterest(double principal, double rate, double time, double timesCompound) {
        double amount = principal * Math.pow(1 + (rate / timesCompound), time * timesCompound);
        double compoundInterest = amount - principal;
        CompoundInterestResult(compoundInterest);
    }

  @SimpleEvent(description = "Get Result from Calculation")
    public void CompoundInterestResult(double compoundInterest) {
        EventDispatcher.dispatchEvent(this, "CompoundInterestResult", compoundInterest);
    }
}
