DROP TABLE IF EXISTS materials;

CREATE TABLE materials (
    id int unsigned AUTO_INCREMENT,
    iupacName VARCHAR(1024) NOT NULL,
    generalName VARCHAR(100) NOT NULL,
    PRIMARY KEY(id)
);

INSERT INTO materials (iupacName, generalName) VALUES ("sodium chloride", "塩");
INSERT INTO materials (iupacName, generalName) VALUES ("hydrogen chloride", "塩酸");
INSERT INTO materials (iupacName, generalName) VALUES ("sulfuric acid", "硫酸");
INSERT INTO materials (iupacName, generalName) VALUES ("metyhl alcohol", "メタノール");
