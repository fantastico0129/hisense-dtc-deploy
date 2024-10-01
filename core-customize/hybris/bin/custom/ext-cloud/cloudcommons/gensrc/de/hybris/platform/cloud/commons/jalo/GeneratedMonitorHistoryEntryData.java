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
import de.hybris.platform.cloud.commons.jalo.MonitorHistoryData;
import de.hybris.platform.cloud.commons.jalo.MonitorHistoryEntryActionData;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.cloud.commons.jalo.MonitorHistoryEntryData MonitorHistoryEntryData}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedMonitorHistoryEntryData extends GenericItem
{
	/** Qualifier of the <code>MonitorHistoryEntryData.step</code> attribute **/
	public static final String STEP = "step";
	/** Qualifier of the <code>MonitorHistoryEntryData.status</code> attribute **/
	public static final String STATUS = "status";
	/** Qualifier of the <code>MonitorHistoryEntryData.started</code> attribute **/
	public static final String STARTED = "started";
	/** Qualifier of the <code>MonitorHistoryEntryData.ended</code> attribute **/
	public static final String ENDED = "ended";
	/** Qualifier of the <code>MonitorHistoryEntryData.duration</code> attribute **/
	public static final String DURATION = "duration";
	/** Qualifier of the <code>MonitorHistoryEntryData.nodeId</code> attribute **/
	public static final String NODEID = "nodeId";
	/** Qualifier of the <code>MonitorHistoryEntryData.message</code> attribute **/
	public static final String MESSAGE = "message";
	/** Qualifier of the <code>MonitorHistoryEntryData.monitorHistoryDataPOS</code> attribute **/
	public static final String MONITORHISTORYDATAPOS = "monitorHistoryDataPOS";
	/** Qualifier of the <code>MonitorHistoryEntryData.monitorHistoryData</code> attribute **/
	public static final String MONITORHISTORYDATA = "monitorHistoryData";
	/** Qualifier of the <code>MonitorHistoryEntryData.actions</code> attribute **/
	public static final String ACTIONS = "actions";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n MONITORHISTORYDATA's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedMonitorHistoryEntryData> MONITORHISTORYDATAHANDLER = new BidirectionalOneToManyHandler<GeneratedMonitorHistoryEntryData>(
	CloudCommonsConstants.TC.MONITORHISTORYENTRYDATA,
	false,
	"monitorHistoryData",
	"monitorHistoryDataPOS",
	true,
	true,
	CollectionType.LIST
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ACTIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<MonitorHistoryEntryActionData> ACTIONSHANDLER = new OneToManyHandler<MonitorHistoryEntryActionData>(
	CloudCommonsConstants.TC.MONITORHISTORYENTRYACTIONDATA,
	true,
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
		tmp.put(STEP, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		tmp.put(STARTED, AttributeMode.INITIAL);
		tmp.put(ENDED, AttributeMode.INITIAL);
		tmp.put(DURATION, AttributeMode.INITIAL);
		tmp.put(NODEID, AttributeMode.INITIAL);
		tmp.put(MESSAGE, AttributeMode.INITIAL);
		tmp.put(MONITORHISTORYDATAPOS, AttributeMode.INITIAL);
		tmp.put(MONITORHISTORYDATA, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryData.actions</code> attribute.
	 * @return the actions
	 */
	public List<MonitorHistoryEntryActionData> getActions(final SessionContext ctx)
	{
		return (List<MonitorHistoryEntryActionData>)ACTIONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryData.actions</code> attribute.
	 * @return the actions
	 */
	public List<MonitorHistoryEntryActionData> getActions()
	{
		return getActions( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryData.actions</code> attribute. 
	 * @param value the actions
	 */
	public void setActions(final SessionContext ctx, final List<MonitorHistoryEntryActionData> value)
	{
		ACTIONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryData.actions</code> attribute. 
	 * @param value the actions
	 */
	public void setActions(final List<MonitorHistoryEntryActionData> value)
	{
		setActions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to actions. 
	 * @param value the item to add to actions
	 */
	public void addToActions(final SessionContext ctx, final MonitorHistoryEntryActionData value)
	{
		ACTIONSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to actions. 
	 * @param value the item to add to actions
	 */
	public void addToActions(final MonitorHistoryEntryActionData value)
	{
		addToActions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from actions. 
	 * @param value the item to remove from actions
	 */
	public void removeFromActions(final SessionContext ctx, final MonitorHistoryEntryActionData value)
	{
		ACTIONSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from actions. 
	 * @param value the item to remove from actions
	 */
	public void removeFromActions(final MonitorHistoryEntryActionData value)
	{
		removeFromActions( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		MONITORHISTORYDATAHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryData.duration</code> attribute.
	 * @return the duration
	 */
	public Long getDuration(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, DURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryData.duration</code> attribute.
	 * @return the duration
	 */
	public Long getDuration()
	{
		return getDuration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryData.duration</code> attribute. 
	 * @return the duration
	 */
	public long getDurationAsPrimitive(final SessionContext ctx)
	{
		Long value = getDuration( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryData.duration</code> attribute. 
	 * @return the duration
	 */
	public long getDurationAsPrimitive()
	{
		return getDurationAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryData.duration</code> attribute. 
	 * @param value the duration
	 */
	public void setDuration(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, DURATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryData.duration</code> attribute. 
	 * @param value the duration
	 */
	public void setDuration(final Long value)
	{
		setDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryData.duration</code> attribute. 
	 * @param value the duration
	 */
	public void setDuration(final SessionContext ctx, final long value)
	{
		setDuration( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryData.duration</code> attribute. 
	 * @param value the duration
	 */
	public void setDuration(final long value)
	{
		setDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryData.ended</code> attribute.
	 * @return the ended
	 */
	public Date getEnded(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ENDED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryData.ended</code> attribute.
	 * @return the ended
	 */
	public Date getEnded()
	{
		return getEnded( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryData.ended</code> attribute. 
	 * @param value the ended
	 */
	public void setEnded(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ENDED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryData.ended</code> attribute. 
	 * @param value the ended
	 */
	public void setEnded(final Date value)
	{
		setEnded( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryData.message</code> attribute.
	 * @return the message
	 */
	public String getMessage(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MESSAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryData.message</code> attribute.
	 * @return the message
	 */
	public String getMessage()
	{
		return getMessage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryData.message</code> attribute. 
	 * @param value the message
	 */
	public void setMessage(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MESSAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryData.message</code> attribute. 
	 * @param value the message
	 */
	public void setMessage(final String value)
	{
		setMessage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryData.monitorHistoryData</code> attribute.
	 * @return the monitorHistoryData
	 */
	public MonitorHistoryData getMonitorHistoryData(final SessionContext ctx)
	{
		return (MonitorHistoryData)getProperty( ctx, MONITORHISTORYDATA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryData.monitorHistoryData</code> attribute.
	 * @return the monitorHistoryData
	 */
	public MonitorHistoryData getMonitorHistoryData()
	{
		return getMonitorHistoryData( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryData.monitorHistoryData</code> attribute. 
	 * @param value the monitorHistoryData
	 */
	public void setMonitorHistoryData(final SessionContext ctx, final MonitorHistoryData value)
	{
		MONITORHISTORYDATAHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryData.monitorHistoryData</code> attribute. 
	 * @param value the monitorHistoryData
	 */
	public void setMonitorHistoryData(final MonitorHistoryData value)
	{
		setMonitorHistoryData( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryData.monitorHistoryDataPOS</code> attribute.
	 * @return the monitorHistoryDataPOS
	 */
	 Integer getMonitorHistoryDataPOS(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MONITORHISTORYDATAPOS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryData.monitorHistoryDataPOS</code> attribute.
	 * @return the monitorHistoryDataPOS
	 */
	 Integer getMonitorHistoryDataPOS()
	{
		return getMonitorHistoryDataPOS( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryData.monitorHistoryDataPOS</code> attribute. 
	 * @return the monitorHistoryDataPOS
	 */
	 int getMonitorHistoryDataPOSAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMonitorHistoryDataPOS( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryData.monitorHistoryDataPOS</code> attribute. 
	 * @return the monitorHistoryDataPOS
	 */
	 int getMonitorHistoryDataPOSAsPrimitive()
	{
		return getMonitorHistoryDataPOSAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryData.monitorHistoryDataPOS</code> attribute. 
	 * @param value the monitorHistoryDataPOS
	 */
	 void setMonitorHistoryDataPOS(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MONITORHISTORYDATAPOS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryData.monitorHistoryDataPOS</code> attribute. 
	 * @param value the monitorHistoryDataPOS
	 */
	 void setMonitorHistoryDataPOS(final Integer value)
	{
		setMonitorHistoryDataPOS( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryData.monitorHistoryDataPOS</code> attribute. 
	 * @param value the monitorHistoryDataPOS
	 */
	 void setMonitorHistoryDataPOS(final SessionContext ctx, final int value)
	{
		setMonitorHistoryDataPOS( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryData.monitorHistoryDataPOS</code> attribute. 
	 * @param value the monitorHistoryDataPOS
	 */
	 void setMonitorHistoryDataPOS(final int value)
	{
		setMonitorHistoryDataPOS( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryData.nodeId</code> attribute.
	 * @return the nodeId
	 */
	public Integer getNodeId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NODEID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryData.nodeId</code> attribute.
	 * @return the nodeId
	 */
	public Integer getNodeId()
	{
		return getNodeId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryData.nodeId</code> attribute. 
	 * @return the nodeId
	 */
	public int getNodeIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNodeId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryData.nodeId</code> attribute. 
	 * @return the nodeId
	 */
	public int getNodeIdAsPrimitive()
	{
		return getNodeIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryData.nodeId</code> attribute. 
	 * @param value the nodeId
	 */
	public void setNodeId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NODEID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryData.nodeId</code> attribute. 
	 * @param value the nodeId
	 */
	public void setNodeId(final Integer value)
	{
		setNodeId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryData.nodeId</code> attribute. 
	 * @param value the nodeId
	 */
	public void setNodeId(final SessionContext ctx, final int value)
	{
		setNodeId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryData.nodeId</code> attribute. 
	 * @param value the nodeId
	 */
	public void setNodeId(final int value)
	{
		setNodeId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryData.started</code> attribute.
	 * @return the started
	 */
	public Date getStarted(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, STARTED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryData.started</code> attribute.
	 * @return the started
	 */
	public Date getStarted()
	{
		return getStarted( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryData.started</code> attribute. 
	 * @param value the started
	 */
	public void setStarted(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, STARTED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryData.started</code> attribute. 
	 * @param value the started
	 */
	public void setStarted(final Date value)
	{
		setStarted( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryData.status</code> attribute.
	 * @return the status
	 */
	public EnumerationValue getStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryData.status</code> attribute.
	 * @return the status
	 */
	public EnumerationValue getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryData.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryData.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final EnumerationValue value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryData.step</code> attribute.
	 * @return the step
	 */
	public EnumerationValue getStep(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STEP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitorHistoryEntryData.step</code> attribute.
	 * @return the step
	 */
	public EnumerationValue getStep()
	{
		return getStep( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryData.step</code> attribute. 
	 * @param value the step
	 */
	public void setStep(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STEP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitorHistoryEntryData.step</code> attribute. 
	 * @param value the step
	 */
	public void setStep(final EnumerationValue value)
	{
		setStep( getSession().getSessionContext(), value );
	}
	
}
