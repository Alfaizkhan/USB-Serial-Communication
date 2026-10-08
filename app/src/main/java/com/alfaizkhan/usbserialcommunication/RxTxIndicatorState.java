package com.alfaizkhan.usbserialcommunication;

public enum RxTxIndicatorState {
    IDLE,
    RX_ACTIVE,
    TX_ACTIVE,
    BOTH_ACTIVE;

    public boolean isReceiving() {
        return this == RX_ACTIVE || this == BOTH_ACTIVE;
    }

    public boolean isTransmitting() {
        return this == TX_ACTIVE || this == BOTH_ACTIVE;
    }
}
