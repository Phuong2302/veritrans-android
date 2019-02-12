package com.midtrans.sdk.corekit.core.api.merchant.model.checkout.request.specific.creditcard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Installment implements Serializable {
    private boolean required;

    @SerializedName("terms")
    @Expose
    private Map<String, List<Integer>> terms;

    public Installment(boolean required, Map<String, List<Integer>> terms) {
        this.required = required;
        this.terms = terms;
    }

    public boolean isRequired() {
        return required;
    }

    public Map<String, List<Integer>> getTerms() {
        return terms;
    }
}