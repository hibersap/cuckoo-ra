/*
 * Copyright (C) 2010 akquinet tech@spree GmbH
 *
 * This file is part of the Cuckoo Resource Adapter for SAP.
 *
 * Cuckoo Resource Adapter for SAP is free software: you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * Cuckoo Resource Adapter for SAP is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser
 * General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along
 * with Cuckoo Resource Adapter for SAP. If not, see <http://www.gnu.org/licenses/>.
 */

package org.cuckoo.ra.it;

import javax.ejb.Local;
import javax.resource.ResourceException;
import javax.resource.cci.MappedRecord;

@Local
public interface TestEjb
{
    MappedRecord callFunctionWithoutTransaction( MappedRecord input ) throws ResourceException;

    MappedRecord callFunctionWithLocalTransaction( MappedRecord input ) throws ResourceException;

    MappedRecord callFunctionWithContainerManagedTransaction( MappedRecord input ) throws ResourceException;

    MappedRecord callFunctionWithContainerManagedTransactionAndThrowRuntimeException( MappedRecord record )
            throws ResourceException;
}
