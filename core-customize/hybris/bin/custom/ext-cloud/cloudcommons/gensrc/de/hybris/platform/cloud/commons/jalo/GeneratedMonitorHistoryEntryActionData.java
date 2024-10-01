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
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.cloud.commons.jalo.MonitorHistoryEntryActionData MonitorHistoryEntryActionData}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedMonitorHistoryEntryActionData extends GenericItem
{
	/** Qualifier of the <code>MonitorHistoryEntryActionData.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>MonitorHistoryEntryActionData.status</code> attribute **/
	public static final String STATUS = "status";
	/** Qualifier of the <code>MonitorHistoryEntryActionData.started</code> attribute **/
	public static final String STARTED = "started";
	/** Qualifier of the <code>MonitorHistoryEntryActionData.ended</code> attribute **/
	public static final String ENDED = "ended";
	/** Qualifier of the <code>MonitorHistoryEntryActionData.duration</code> attribute **/
	public static final String DURATION = "duration";
	/** Qualifier of the <code>MonitorHistoryEntryActionData.message</code> attribute **/
	public static final String MESSAGE = "message";
	/** Qualifier of the <code>MonitorHistoryEntryActionData.monitorHistoryEntryDataPOS</code> attribute **/
	public static final String MONITORHISTORYENTRYDATAPOS = "monitorHistoryEntryDataPOS";
	/** Qualifier of the <code>MonitorHistoryEntryActionData.monitorHistoryEntryData</code> attribute **/
	public static final String MONITORHISTORYENTRYDATA = "monitorHistoryEntryData";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n MONITORHISTORYENTRYDATA's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedMonitorHistoryEntryActionData> MONITORHISTORYENTRYDATAHANDLER = new BidirectionalOneToManyHandler<GeneratedMonitorHistoryEntryActionData>(
	CloudCommonsConstants.TC.MONITORHISTORYENTRYACTIONDATA,
	false,
	"monitorHistoryEntryData",
	"monitorHistoryEntryDataPOS",
	true,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		tmp.put(STARTED, AttributeMode.INITIAL);
		tmp.put(ENDED, AttributeMode.INITIAL);
		tmp.put(DURATION, AttributeMode.INITIAL);
		tmp.put(MESSAGE, AttributeMode.INITIAL);
		tmp.put(MONITORHISTORYENTRYDATAPOS, AttributeMode.INITIAL);
		tmp.put(MONITORHISTORYENTRYDATA, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryActionData.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryActionData.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryActionData.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryActionData.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		MONITORHISTORYENTRYDATAHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryActionData.duration</code> attribute.
	 * @return the duration
	 */
	public Long getDuration(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, DURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryActionData.duration</code> attribute.
	 * @return the duration
	 */
	public Long getDuration()
	{
		return getDuration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryActionData.duration</code> attribute. 
	 * @return the duration
	 */
	public long getDurationAsPrimitive(final SessionContext ctx)
	{
		Long value = getDuration( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryActionData.duration</code> attribute. 
	 * @return the duration
	 */
	public long getDurationAsPrimitive()
	{
		return getDurationAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryActionData.duration</code> attribute. 
	 * @param value the duration
	 */
	public void setDuration(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, DURATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryActionData.duration</code> attribute. 
	 * @param value the duration
	 */
	public void setDuration(final Long value)
	{
		setDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryActionData.duration</code> attribute. 
	 * @param value the duration
	 */
	public void setDuration(final SessionContext ctx, final long value)
	{
		setDuration( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryActionData.duration</code> attribute. 
	 * @param value the duration
	 */
	public void setDuration(final long value)
	{
		setDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryActionData.ended</code> attribute.
	 * @return the ended
	 */
	public Date getEnded(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ENDED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryActionData.ended</code> attribute.
	 * @return the ended
	 */
	public Date getEnded()
	{
		return getEnded( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryActionData.ended</code> attribute. 
	 * @param value the ended
	 */
	public void setEnded(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ENDED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryActionData.ended</code> attribute. 
	 * @param value the ended
	 */
	public void setEnded(final Date value)
	{
		setEnded( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryActionData.message</code> attribute.
	 * @return the message
	 */
	public String getMessage(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MESSAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryActionData.message</code> attribute.
	 * @return the message
	 */
	public String getMessage()
	{
		return getMessage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryActionData.message</code> attribute. 
	 * @param value the message
	 */
	public void setMessage(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MESSAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryActionData.message</code> attribute. 
	 * @param value the message
	 */
	public void setMessage(final String value)
	{
		setMessage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryActionData.monitorHistoryEntryData</code> attribute.
	 * @return the monitorHistoryEntryData
	 */
	public MonitorHistoryEntryData getMonitorHistoryEntryData(final SessionContext ctx)
	{
		return (MonitorHistoryEntryData)getProperty( ctx, MONITORHISTORYENTRYDATA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryActionData.monitorHistoryEntryData</code> attribute.
	 * @return the monitorHistoryEntryData
	 */
	public MonitorHistoryEntryData getMonitorHistoryEntryData()
	{
		return getMonitorHistoryEntryData( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryActionData.monitorHistoryEntryData</code> attribute. 
	 * @param value the monitorHistoryEntryData
	 */
	public void setMonitorHistoryEntryData(final SessionContext ctx, final MonitorHistoryEntryData value)
	{
		MONITORHISTORYENTRYDATAHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryActionData.monitorHistoryEntryData</code> attribute. 
	 * @param value the monitorHistoryEntryData
	 */
	public void setMonitorHistoryEntryData(final MonitorHistoryEntryData value)
	{
		setMonitorHistoryEntryData( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryActionData.monitorHistoryEntryDataPOS</code> attribute.
	 * @return the monitorHistoryEntryDataPOS
	 */
	 Integer getMonitorHistoryEntryDataPOS(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MONITORHISTORYENTRYDATAPOS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryActionData.monitorHistoryEntryDataPOS</code> attribute.
	 * @return the monitorHistoryEntryDataPOS
	 */
	 Integer getMonitorHistoryEntryDataPOS()
	{
		return getMonitorHistoryEntryDataPOS( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryActionData.monitorHistoryEntryDataPOS</code> attribute. 
	 * @return the monitorHistoryEntryDataPOS
	 */
	 int getMonitorHistoryEntryDataPOSAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMonitorHistoryEntryDataPOS( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryActionData.monitorHistoryEntryDataPOS</code> attribute. 
	 * @return the monitorHistoryEntryDataPOS
	 */
	 int getMonitorHistoryEntryDataPOSAsPrimitive()
	{
		return getMonitorHistoryEntryDataPOSAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryActionData.monitorHistoryEntryDataPOS</code> attribute. 
	 * @param value the monitorHistoryEntryDataPOS
	 */
	 void setMonitorHistoryEntryDataPOS(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MONITORHISTORYENTRYDATAPOS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryActionData.monitorHistoryEntryDataPOS</code> attribute. 
	 * @param value the monitorHistoryEntryDataPOS
	 */
	 void setMonitorHistoryEntryDataPOS(final Integer value)
	{
		setMonitorHistoryEntryDataPOS( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryActionData.monitorHistoryEntryDataPOS</code> attribute. 
	 * @param value the monitorHistoryEntryDataPOS
	 */
	 void setMonitorHistoryEntryDataPOS(final SessionContext ctx, final int value)
	{
		setMonitorHistoryEntryDataPOS( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryActionData.monitorHistoryEntryDataPOS</code> attribute. 
	 * @param value the monitorHistoryEntryDataPOS
	 */
	 void setMonitorHistoryEntryDataPOS(final int value)
	{
		setMonitorHistoryEntryDataPOS( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryActionData.started</code> attribute.
	 * @return the started
	 */
	public Date getStarted(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, STARTED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryActionData.started</code> attribute.
	 * @return the started
	 */
	public Date getStarted()
	{
		return getStarted( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryActionData.started</code> attribute. 
	 * @param value the started
	 */
	public void setStarted(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, STARTED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryActionData.started</code> attribute. 
	 * @param value the started
	 */
	public void setStarted(final Date value)
	{
		setStarted( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryActionData.status</code> attribute.
	 * @return the status
	 */
	public EnumerationValue getStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryActionData.status</code> attribute.
	 * @return the status
	 */
	public EnumerationValue getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryActionData.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryActionData.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final EnumerationValue value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
}
