package com.maxim.api.dumb;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

public class MonBean implements Serializable {
    protected int value;
    PropertyChangeSupport propertyChangeSupport;
    MonBean() {
        value = 0;
        propertyChangeSupport = new PropertyChangeSupport(this);
    }
    public synchronized void setValue(int newValue) {
        int oldValue = value;
        value = newValue;
        propertyChangeSupport.firePropertyChange("Value", oldValue, newValue);
    }
    public synchronized int getValue() {
        return value;
    }
    public synchronized void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public synchronized void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }
}
