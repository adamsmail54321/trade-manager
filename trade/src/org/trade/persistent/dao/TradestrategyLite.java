/* ===========================================================
 * TradeManager : a application to trade strategies for the Java(tm) platform
 * ===========================================================
 *
 * (C) Copyright 2011-2011, by Simon Allen and Contributors.
 *
 * Project Info:  org.trade
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 *
 * [Java is a trademark or registered trademark of Oracle, Inc.
 * in the United States and other countries.]
 *
 * (C) Copyright 2011-2011, by Simon Allen and Contributors.
 *
 * Original Author:  Simon Allen;
 * Contributor(s):   -;
 *
 * Changes
 * -------
 *
 */
package org.trade.persistent.dao;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.trade.core.dao.Aspect;

/**
 * TradestrategyContract generated by hbm2java
 * 
 * @author Simon Allen
 * @version $Revision: 1.0 $
 */
@Entity
@Table(name = "tradestrategy")
public class TradestrategyLite extends Aspect implements Serializable {

	private static final long serialVersionUID = -2181676329258092177L;

	private String status;
	private Date lastUpdateDate;

	public TradestrategyLite() {
	}
	
	public TradestrategyLite(Integer version) {
		this.version = version;
	}

	/**
	 * Method getIdTradeStrategy.
	 * 
	 * @return Integer
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idTradeStrategy", unique = true, nullable = false)
	public Integer getIdTradeStrategy() {
		return this.id;
	}

	/**
	 * Method setIdTradeStrategy.
	 * 
	 * @param idTradeStrategy
	 *            Integer
	 */
	public void setIdTradeStrategy(Integer idTradeStrategy) {
		this.id = idTradeStrategy;
	}

	/**
	 * Method getStatus.
	 * 
	 * @return String
	 */
	@Column(name = "status", length = 20)
	public String getStatus() {
		return this.status;
	}

	/**
	 * Method setStatus.
	 * 
	 * @param status
	 *            String
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Method getLastUpdateDate.
	 * 
	 * @return Date
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "lastUpdateDate", nullable = false, length = 19)
	public Date getLastUpdateDate() {
		return this.lastUpdateDate;
	}

	/**
	 * Method setLastUpdateDate.
	 * 
	 * @param lastUpdateDate
	 *            Date
	 */
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	/**
	 * Method getVersion.
	 * 
	 * @return Integer
	 */
	@Version
	@Column(name = "version")
	public Integer getVersion() {
		return this.version;
	}

	/**
	 * Method setVersion.
	 * 
	 * @param version
	 *            Integer
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}
}
