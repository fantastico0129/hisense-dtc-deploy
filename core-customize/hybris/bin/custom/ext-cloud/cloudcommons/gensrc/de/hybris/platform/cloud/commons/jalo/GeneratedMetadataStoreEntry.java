/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2024年9月29日 下午2:52:48                        ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2024 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cloud.commons.jalo;

import de.hybris.platform.cloud.commons.constants.CloudCommonsConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.cloud.commons.jalo.MetadataStoreEntry MetadataStoreEntry}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedMetadataStoreEntry extends GenericItem
{
	/** Qualifier of the <code>MetadataStoreEntry.region</code> attribute **/
	public static final String REGION = "region";
	/** Qualifier of the <code>MetadataStoreEntry.key</code> attribute **/
	public static final String KEY = "key";
	/** Qualifier of the <code>MetadataStoreEntry.value</code> attribute **/
	public static final String VALUE = "value";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(REGION, AttributeMode.INITIAL);
		tmp.put(KEY, AttributeMode.INITIAL);
		tmp.put(VALUE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MetadataStoreEntry.key</code> attribute.
	 * @return the key
	 */
	public String getKey(final SessionContext ctx)
	{
		return (String)getProperty( ctx, KEY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MetadataStoreEntry.key</code> attribute.
	 * @return the key
	 */
	public String getKey()
	{
		return getKey( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MetadataStoreEntry.key</code> attribute. 
	 * @param value the key
	 */
	protected void setKey(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+KEY+"' is not changeable", 0 );
		}
		setProperty(ctx, KEY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MetadataStoreEntry.key</code> attribute. 
	 * @param value the key
	 */
	protected void setKey(final String value)
	{
		setKey( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MetadataStoreEntry.region</code> attribute.
	 * @return the region
	 */
	public String getRegion(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REGION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MetadataStoreEntry.region</code> attribute.
	 * @return the region
	 */
	public String getRegion()
	{
		return getRegion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MetadataStoreEntry.region</code> attribute. 
	 * @param value the region
	 */
	protected void setRegion(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+REGION+"' is not changeable", 0 );
		}
		setProperty(ctx, REGION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MetadataStoreEntry.region</code> attribute. 
	 * @param value the region
	 */
	protected void setRegion(final String value)
	{
		setRegion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MetadataStoreEntry.value</code> attribute.
	 * @return the value
	 */
	public String getValue(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MetadataStoreEntry.value</code> attribute.
	 * @return the value
	 */
	public String getValue()
	{
		return getValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MetadataStoreEntry.value</code> attribute. 
	 * @param value the value
	 */
	public void setValue(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MetadataStoreEntry.value</code> attribute. 
	 * @param value the value
	 */
	public void setValue(final String value)
	{
		setValue( getSession().getSessionContext(), value );
	}
	
}
