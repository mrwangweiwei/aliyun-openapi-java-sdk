/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.teslamaxcompute.model.v20180104;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.teslamaxcompute.transform.v20180104.QueryTopologyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTopologyResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Result result;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String lastUpdate;

		private Regions regions;

		public String getLastUpdate() {
			return this.lastUpdate;
		}

		public void setLastUpdate(String lastUpdate) {
			this.lastUpdate = lastUpdate;
		}

		public Regions getRegions() {
			return this.regions;
		}

		public void setRegions(Regions regions) {
			this.regions = regions;
		}

		public static class Regions {

			private String region;

			private String regionEnName;

			private String regionCnName;

			private Clusters clusters;

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getRegionEnName() {
				return this.regionEnName;
			}

			public void setRegionEnName(String regionEnName) {
				this.regionEnName = regionEnName;
			}

			public String getRegionCnName() {
				return this.regionCnName;
			}

			public void setRegionCnName(String regionCnName) {
				this.regionCnName = regionCnName;
			}

			public Clusters getClusters() {
				return this.clusters;
			}

			public void setClusters(Clusters clusters) {
				this.clusters = clusters;
			}

			public static class Clusters {

				private String cluster;

				private String productLine;

				private String productClass;

				private String netCode;

				private String business;

				private String machineRoom;

				private String netArch;

				public String getCluster() {
					return this.cluster;
				}

				public void setCluster(String cluster) {
					this.cluster = cluster;
				}

				public String getProductLine() {
					return this.productLine;
				}

				public void setProductLine(String productLine) {
					this.productLine = productLine;
				}

				public String getProductClass() {
					return this.productClass;
				}

				public void setProductClass(String productClass) {
					this.productClass = productClass;
				}

				public String getNetCode() {
					return this.netCode;
				}

				public void setNetCode(String netCode) {
					this.netCode = netCode;
				}

				public String getBusiness() {
					return this.business;
				}

				public void setBusiness(String business) {
					this.business = business;
				}

				public String getMachineRoom() {
					return this.machineRoom;
				}

				public void setMachineRoom(String machineRoom) {
					this.machineRoom = machineRoom;
				}

				public String getNetArch() {
					return this.netArch;
				}

				public void setNetArch(String netArch) {
					this.netArch = netArch;
				}
			}
		}
	}

	@Override
	public QueryTopologyResponse getInstance(UnmarshallerContext context) {
		return	QueryTopologyResponseUnmarshaller.unmarshall(this, context);
	}
}
