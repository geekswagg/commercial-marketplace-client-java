// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.microsoft.marketplace.saas.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The RecurrentBillingTerm model. */
@Fluent
public final class RecurrentBillingTerm {
    /*
     * The currency property.
     */
    @JsonProperty(value = "currency")
    private String currency;

    /*
     * The price property.
     */
    @JsonProperty(value = "price")
    private Float price;

    /*
     * The termUnit property.
     */
    @JsonProperty(value = "termUnit")
    private TermUnitEnum termUnit;

    /*
     * The termDescription property.
     */
    @JsonProperty(value = "termDescription")
    private String termDescription;

    /*
     * The meteredQuantityIncluded property.
     */
    @JsonProperty(value = "meteredQuantityIncluded")
    private List<MeteringedQuantityIncluded> meteredQuantityIncluded;

    /**
     * Get the currency property: The currency property.
     *
     * @return the currency value.
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * Set the currency property: The currency property.
     *
     * @param currency the currency value to set.
     * @return the RecurrentBillingTerm object itself.
     */
    public RecurrentBillingTerm setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Get the price property: The price property.
     *
     * @return the price value.
     */
    public Float getPrice() {
        return this.price;
    }

    /**
     * Set the price property: The price property.
     *
     * @param price the price value to set.
     * @return the RecurrentBillingTerm object itself.
     */
    public RecurrentBillingTerm setPrice(Float price) {
        this.price = price;
        return this;
    }

    /**
     * Get the termUnit property: The termUnit property.
     *
     * @return the termUnit value.
     */
    public TermUnitEnum getTermUnit() {
        return this.termUnit;
    }

    /**
     * Set the termUnit property: The termUnit property.
     *
     * @param termUnit the termUnit value to set.
     * @return the RecurrentBillingTerm object itself.
     */
    public RecurrentBillingTerm setTermUnit(TermUnitEnum termUnit) {
        this.termUnit = termUnit;
        return this;
    }

    /**
     * Get the termDescription property: The termDescription property.
     *
     * @return the termDescription value.
     */
    public String getTermDescription() {
        return this.termDescription;
    }

    /**
     * Set the termDescription property: The termDescription property.
     *
     * @param termDescription the termDescription value to set.
     * @return the RecurrentBillingTerm object itself.
     */
    public RecurrentBillingTerm setTermDescription(String termDescription) {
        this.termDescription = termDescription;
        return this;
    }

    /**
     * Get the meteredQuantityIncluded property: The meteredQuantityIncluded property.
     *
     * @return the meteredQuantityIncluded value.
     */
    public List<MeteringedQuantityIncluded> getMeteredQuantityIncluded() {
        return this.meteredQuantityIncluded;
    }

    /**
     * Set the meteredQuantityIncluded property: The meteredQuantityIncluded property.
     *
     * @param meteredQuantityIncluded the meteredQuantityIncluded value to set.
     * @return the RecurrentBillingTerm object itself.
     */
    public RecurrentBillingTerm setMeteredQuantityIncluded(List<MeteringedQuantityIncluded> meteredQuantityIncluded) {
        this.meteredQuantityIncluded = meteredQuantityIncluded;
        return this;
    }
}