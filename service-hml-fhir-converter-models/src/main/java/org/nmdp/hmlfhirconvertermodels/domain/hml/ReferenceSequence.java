package org.nmdp.hmlfhirconvertermodels.domain.hml;

/**
 * Created by Andrew S. Brown, Ph.D., <andrew@nmdp.org>, on 5/26/17.
 * <p>
 * service-hml-fhir-converter-models
 * Copyright (c) 2012-2017 National Marrow Donor Program (NMDP)
 * <p>
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation; either version 3 of the License, or (at
 * your option) any later version.
 * <p>
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; with out even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public
 * License for more details.
 * <p>
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library;  if not, write to the Free Software Foundation,
 * Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307  USA.
 * <p>
 * > http://www.fsf.org/licensing/licenses/lgpl.html
 * > http://www.opensource.org/licenses/lgpl-license.php
 */

import org.nmdp.hmlfhirconvertermodels.domain.base.SwaggerConverter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Document(collection = "Hml.Samples.Typings.ConsensusSequences.ReferenceDatabases.ReferenceSequences")
public class ReferenceSequence  extends SwaggerConverter<ReferenceSequence, org.nmdp.hmlfhirconvertermodels.dto.hml.ReferenceSequence> implements Serializable, ICascadable {

    private static Class<ReferenceSequence> tClass = ReferenceSequence.class;
    private static Class<org.nmdp.hmlfhirconvertermodels.dto.hml.ReferenceSequence> uClass = org.nmdp.hmlfhirconvertermodels.dto.hml.ReferenceSequence.class;

    public ReferenceSequence() {
        super(tClass, uClass);
    }

    public ReferenceSequence(Boolean active) {
        super (tClass, uClass);
        this.active = active;
        this.dateUpdated = null;
    }

    @XmlAttribute
    @Id
    private String id;

    @XmlAttribute
    private String referenceSequenceId;

    @XmlAttribute
    private String name;

    @XmlAttribute
    private String description;

    @XmlAttribute
    private Integer start;

    @XmlAttribute
    private Integer end;

    @XmlAttribute
    private String accession;

    @XmlAttribute
    private String strand;

    @XmlAttribute
    private String uri;

    @XmlAttribute
    private Boolean active;

    @XmlAttribute
    private Date dateCreated;

    @XmlAttribute
    private Date dateUpdated;
}
