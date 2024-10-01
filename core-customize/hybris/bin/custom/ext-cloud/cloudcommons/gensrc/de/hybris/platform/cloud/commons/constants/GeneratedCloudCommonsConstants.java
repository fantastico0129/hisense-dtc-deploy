/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2024年9月29日 下午2:52:48                        ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2024 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cloud.commons.constants;

/**
 * @deprecated since ages - use constants in Model classes instead
 */
@Deprecated(since = "ages", forRemoval = false)
@SuppressWarnings({"unused","cast"})
public class GeneratedCloudCommonsConstants
{
	public static final String EXTENSIONNAME = "cloudcommons";
	public static class TC
	{
		public static final String APPLICATIONRESOURCELOCK = "ApplicationResourceLock".intern();
		public static final String METADATASTOREENTRY = "MetadataStoreEntry".intern();
		public static final String MONITORHISTORYDATA = "MonitorHistoryData".intern();
		public static final String MONITORHISTORYENTRYACTIONDATA = "MonitorHistoryEntryActionData".intern();
		public static final String MONITORHISTORYENTRYDATA = "MonitorHistoryEntryData".intern();
		public static final String MONITORSTATUS = "MonitorStatus".intern();
		public static final String MONITORSTEP = "MonitorStep".intern();
		public static final String MONITORSYSTEMAREA = "MonitorSystemArea".intern();
	}
	public static class Attributes
	{
		// no constants defined.
	}
	public static class Enumerations
	{
		public static class MonitorStatus
		{
			public static final String IN_PROGRESS = "IN_PROGRESS".intern();
			public static final String SUCCESS = "SUCCESS".intern();
			public static final String FAILURE = "FAILURE".intern();
			public static final String WARNING = "WARNING".intern();
		}
		public static class MonitorStep
		{
			public static final String PROCESS = "PROCESS".intern();
		}
		public static class MonitorSystemArea
		{
			public static final String INTEGRATION = "INTEGRATION".intern();
		}
	}
	public static class Relations
	{
		public static final String MONITORHISTORYDATA2ENTRY = "MonitorHistoryData2Entry".intern();
		public static final String MONITORHISTORYENTRYDATA2ACTION = "MonitorHistoryEntryData2Action".intern();
	}
	
	protected GeneratedCloudCommonsConstants()
	{
		// private constructor
	}
	
	
}
