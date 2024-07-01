import sys

inf=sys.argv[1]

mapOld2New=dict()
with open(inf) as fin, open(inf+'.ren','w') as fout:
	line=fin.readline()
	while line:
		cols=line.split("\t",1)
		if cols[0] in mapOld2New:
			cols[0]=mapOld2New[cols[0]]
		else:
			cntchr=str(len(mapOld2New)+1)
			mapOld2New[cols[0]]=cntchr
			cols[0]=cntchr

		fout.write( "\t".join(cols) )
		line=fin.readline()


