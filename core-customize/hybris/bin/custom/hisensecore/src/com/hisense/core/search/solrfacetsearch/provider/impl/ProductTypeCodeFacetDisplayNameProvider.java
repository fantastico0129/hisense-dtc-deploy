package com.hisense.core.search.solrfacetsearch.provider.impl;

import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.provider.impl.AbstractFacetValueDisplayNameProvider;
import de.hybris.platform.solrfacetsearch.search.SearchQuery;

public class ProductTypeCodeFacetDisplayNameProvider extends AbstractFacetValueDisplayNameProvider {

    @Override
    public String getDisplayName(SearchQuery searchQuery, IndexedProperty indexedProperty, String facetValue) {
        return facetValue;
    }
}
