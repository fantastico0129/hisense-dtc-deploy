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
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.cloud.commons.jalo.ApplicationResourceLock ApplicationResourceLock}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedApplicationResourceLock extends GenericItem
{
	/** Qualifier of the <code>ApplicationResourceLock.region</code> attribute **/
	public static final String REGION = "region";
	/** Qualifier of the <code>ApplicationResourceLock.lockKey</code> attribute **/
	public static final String LOCKKEY = "lockKey";
	/** Qualifier of the <code>ApplicationResourceLock.clusterId</code> attribute **/
	public static final String CLUSTERID = "clusterId";
	/** Qualifier of the <code>ApplicationResourceLock.timestamp</code> attribute **/
	public static final String TIMESTAMP = "timestamp";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(REGION, AttributeMode.INITIAL);
		tmp.put(LOCKKEY, AttributeMode.INITIAL);
		tmp.put(CLUSTERID, AttributeMode.INITIAL);
		tmp.put(TIMESTAMP, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApplicationResourceLock.clusterId</code> attribute.
	 * @return the clusterId - The cluster node that holds the lock
	 */
	public Integer getClusterId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, CLUSTERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApplicationResourceLock.clusterId</code> attribute.
	 * @return the clusterId - The cluster node that holds the lock
	 */
	public Integer getClusterId()
	{
		return getClusterId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApplicationResourceLock.clusterId</code> attribute. 
	 * @return the clusterId - The cluster node that holds the lock
	 */
	public int getClusterIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getClusterId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApplicationResourceLock.clusterId</code> attribute. 
	 * @return the clusterId - The cluster node that holds the lock
	 */
	public int getClusterIdAsPrimitive()
	{
		return getClusterIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApplicationResourceLock.clusterId</code> attribute. 
	 * @param value the clusterId - The cluster node that holds the lock
	 */
	protected void setClusterId(final SessionContext ctx, final Integer value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+CLUSTERID+"' is not changeable", 0 );
		}
		setProperty(ctx, CLUSTERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApplicationResourceLock.clusterId</code> attribute. 
	 * @param value the clusterId - The cluster node that holds the lock
	 */
	protected void setClusterId(final Integer value)
	{
		setClusterId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApplicationResourceLock.clusterId</code> attribute. 
	 * @param value the clusterId - The cluster node that holds the lock
	 */
	protected void setClusterId(final SessionContext ctx, final int value)
	{
		setClusterId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApplicationResourceLock.clusterId</code> attribute. 
	 * @param value the clusterId - The cluster node that holds the lock
	 */
	protected void setClusterId(final int value)
	{
		setClusterId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApplicationResourceLock.lockKey</code> attribute.
	 * @return the lockKey - The key of the lock
	 */
	public String getLockKey(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LOCKKEY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApplicationResourceLock.lockKey</code> attribute.
	 * @return the lockKey - The key of the lock
	 */
	public String getLockKey()
	{
		return getLockKey( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApplicationResourceLock.lockKey</code> attribute. 
	 * @param value the lockKey - The key of the lock
	 */
	protected void setLockKey(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+LOCKKEY+"' is not changeable", 0 );
		}
		setProperty(ctx, LOCKKEY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApplicationResourceLock.lockKey</code> attribute. 
	 * @param value the lockKey - The key of the lock
	 */
	protected void setLockKey(final String value)
	{
		setLockKey( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApplicationResourceLock.region</code> attribute.
	 * @return the region - The scope of the lock
	 */
	public String getRegion(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REGION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApplicationResourceLock.region</code> attribute.
	 * @return the region - The scope of the lock
	 */
	public String getRegion()
	{
		return getRegion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApplicationResourceLock.region</code> attribute. 
	 * @param value the region - The scope of the lock
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
	 * <i>Generated method</i> - Setter of the <code>ApplicationResourceLock.region</code> attribute. 
	 * @param value the region - The scope of the lock
	 */
	protected void setRegion(final String value)
	{
		setRegion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApplicationResourceLock.timestamp</code> attribute.
	 * @return the timestamp - The last-used timestamp for the lock
	 */
	public Date getTimestamp(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, TIMESTAMP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApplicationResourceLock.timestamp</code> attribute.
	 * @return the timestamp - The last-used timestamp for the lock
	 */
	public Date getTimestamp()
	{
		return getTimestamp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApplicationResourceLock.timestamp</code> attribute. 
	 * @param value the timestamp - The last-used timestamp for the lock
	 */
	public void setTimestamp(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, TIMESTAMP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApplicationResourceLock.timestamp</code> attribute. 
	 * @param value the timestamp - The last-used timestamp for the lock
	 */
	public void setTimestamp(final Date value)
	{
		setTimestamp( getSession().getSessionContext(), value );
	}
	
}
