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
import de.hybris.platform.cloud.commons.jalo.MonitorHistoryEntryData;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.cloud.commons.jalo.MonitorHistoryData MonitorHistoryData}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedMonitorHistoryData extends GenericItem
{
	/** Qualifier of the <code>MonitorHistoryData.key</code> attribute **/
	public static final String KEY = "key";
	/** Qualifier of the <code>MonitorHistoryData.systemArea</code> attribute **/
	public static final String SYSTEMAREA = "systemArea";
	/** Qualifier of the <code>MonitorHistoryData.status</code> attribute **/
	public static final String STATUS = "status";
	/** Qualifier of the <code>MonitorHistoryData.exceptionMessage</code> attribute **/
	public static final String EXCEPTIONMESSAGE = "exceptionMessage";
	/** Qualifier of the <code>MonitorHistoryData.entries</code> attribute **/
	public static final String ENTRIES = "entries";
	/**
	* {@link OneToManyHandler} for handling 1:n ENTRIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<MonitorHistoryEntryData> ENTRIESHANDLER = new OneToManyHandler<MonitorHistoryEntryData>(
	CloudCommonsConstants.TC.MONITORHISTORYENTRYDATA,
	true,
	"monitorHistoryData",
	"monitorHistoryDataPOS",
	true,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(KEY, AttributeMode.INITIAL);
		tmp.put(SYSTEMAREA, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		tmp.put(EXCEPTIONMESSAGE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryData.entries</code> attribute.
	 * @return the entries
	 */
	public List<MonitorHistoryEntryData> getEntries(final SessionContext ctx)
	{
		return (List<MonitorHistoryEntryData>)ENTRIESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryData.entries</code> attribute.
	 * @return the entries
	 */
	public List<MonitorHistoryEntryData> getEntries()
	{
		return getEntries( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryData.entries</code> attribute. 
	 * @param value the entries
	 */
	public void setEntries(final SessionContext ctx, final List<MonitorHistoryEntryData> value)
	{
		ENTRIESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryData.entries</code> attribute. 
	 * @param value the entries
	 */
	public void setEntries(final List<MonitorHistoryEntryData> value)
	{
		setEntries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to entries. 
	 * @param value the item to add to entries
	 */
	public void addToEntries(final SessionContext ctx, final MonitorHistoryEntryData value)
	{
		ENTRIESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to entries. 
	 * @param value the item to add to entries
	 */
	public void addToEntries(final MonitorHistoryEntryData value)
	{
		addToEntries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from entries. 
	 * @param value the item to remove from entries
	 */
	public void removeFromEntries(final SessionContext ctx, final MonitorHistoryEntryData value)
	{
		ENTRIESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from entries. 
	 * @param value the item to remove from entries
	 */
	public void removeFromEntries(final MonitorHistoryEntryData value)
	{
		removeFromEntries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryData.exceptionMessage</code> attribute.
	 * @return the exceptionMessage
	 */
	public String getExceptionMessage(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EXCEPTIONMESSAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryData.exceptionMessage</code> attribute.
	 * @return the exceptionMessage
	 */
	public String getExceptionMessage()
	{
		return getExceptionMessage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryData.exceptionMessage</code> attribute. 
	 * @param value the exceptionMessage
	 */
	public void setExceptionMessage(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EXCEPTIONMESSAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryData.exceptionMessage</code> attribute. 
	 * @param value the exceptionMessage
	 */
	public void setExceptionMessage(final String value)
	{
		setExceptionMessage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryData.key</code> attribute.
	 * @return the key
	 */
	public String getKey(final SessionContext ctx)
	{
		return (String)getProperty( ctx, KEY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryData.key</code> attribute.
	 * @return the key
	 */
	public String getKey()
	{
		return getKey( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryData.key</code> attribute. 
	 * @param value the key
	 */
	public void setKey(final SessionContext ctx, final String value)
	{
		setProperty(ctx, KEY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryData.key</code> attribute. 
	 * @param value the key
	 */
	public void setKey(final String value)
	{
		setKey( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryData.status</code> attribute.
	 * @return the status
	 */
	public EnumerationValue getStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryData.status</code> attribute.
	 * @return the status
	 */
	public EnumerationValue getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryData.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryData.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final EnumerationValue value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryData.systemArea</code> attribute.
	 * @return the systemArea
	 */
	public EnumerationValue getSystemArea(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SYSTEMAREA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryData.systemArea</code> attribute.
	 * @return the systemArea
	 */
	public EnumerationValue getSystemArea()
	{
		return getSystemArea( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryData.systemArea</code> attribute. 
	 * @param value the systemArea
	 */
	public void setSystemArea(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SYSTEMAREA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryData.systemArea</code> attribute. 
	 * @param value the systemArea
	 */
	public void setSystemArea(final EnumerationValue value)
	{
		setSystemArea( getSession().getSessionContext(), value );
	}
	
}
