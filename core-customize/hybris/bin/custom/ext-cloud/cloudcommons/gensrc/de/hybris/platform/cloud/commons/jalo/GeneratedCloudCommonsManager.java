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
import de.hybris.platform.cloud.commons.jalo.ApplicationResourceLock;
import de.hybris.platform.cloud.commons.jalo.MetadataStoreEntry;
import de.hybris.platform.cloud.commons.jalo.MonitorHistoryData;
import de.hybris.platform.cloud.commons.jalo.MonitorHistoryEntryActionData;
import de.hybris.platform.cloud.commons.jalo.MonitorHistoryEntryData;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>CloudCommonsManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedCloudCommonsManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public ApplicationResourceLock createApplicationResourceLock(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CloudCommonsConstants.TC.APPLICATIONRESOURCELOCK );
			return (ApplicationResourceLock)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApplicationResourceLock : "+e.getMessage(), 0 );
		}
	}
	
	public ApplicationResourceLock createApplicationResourceLock(final Map attributeValues)
	{
		return createApplicationResourceLock( getSession().getSessionContext(), attributeValues );
	}
	
	public MetadataStoreEntry createMetadataStoreEntry(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CloudCommonsConstants.TC.METADATASTOREENTRY );
			return (MetadataStoreEntry)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating MetadataStoreEntry : "+e.getMessage(), 0 );
		}
	}
	
	public MetadataStoreEntry createMetadataStoreEntry(final Map attributeValues)
	{
		return createMetadataStoreEntry( getSession().getSessionContext(), attributeValues );
	}
	
	public MonitorHistoryData createMonitorHistoryData(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CloudCommonsConstants.TC.MONITORHISTORYDATA );
			return (MonitorHistoryData)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating MonitorHistoryData : "+e.getMessage(), 0 );
		}
	}
	
	public MonitorHistoryData createMonitorHistoryData(final Map attributeValues)
	{
		return createMonitorHistoryData( getSession().getSessionContext(), attributeValues );
	}
	
	public MonitorHistoryEntryActionData createMonitorHistoryEntryActionData(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CloudCommonsConstants.TC.MONITORHISTORYENTRYACTIONDATA );
			return (MonitorHistoryEntryActionData)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating MonitorHistoryEntryActionData : "+e.getMessage(), 0 );
		}
	}
	
	public MonitorHistoryEntryActionData createMonitorHistoryEntryActionData(final Map attributeValues)
	{
		return createMonitorHistoryEntryActionData( getSession().getSessionContext(), attributeValues );
	}
	
	public MonitorHistoryEntryData createMonitorHistoryEntryData(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CloudCommonsConstants.TC.MONITORHISTORYENTRYDATA );
			return (MonitorHistoryEntryData)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating MonitorHistoryEntryData : "+e.getMessage(), 0 );
		}
	}
	
	public MonitorHistoryEntryData createMonitorHistoryEntryData(final Map attributeValues)
	{
		return createMonitorHistoryEntryData( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return CloudCommonsConstants.EXTENSIONNAME;
	}
	
}
