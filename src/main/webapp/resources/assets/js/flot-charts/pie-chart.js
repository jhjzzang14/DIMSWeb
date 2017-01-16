$(document).ready(function(){
	
	console.dir(dashVO)
	
    var pieData = [
        {data: dashVO.babyF, color: '#F44336', label: '여자아이'},
        {data: dashVO.babyM, color: '#03A9F4', label: '남자아이'},
        
    ];
	
	var parentingData = [
        {data: dashVO.nursingCnt, color: '#F44336', label: '수유서비스'},
        {data: dashVO.defecCnt, color: '#03A9F4', label: '배변서비스'},
        {data: dashVO.medicineCnt, color: '#e8f951', label: '약복용서비스'},
        {data: dashVO.temperCnt, color: '#ff8040', label: '체온서비스'}
    ];
    
    /* Pie Chart */
    console.log('>>>>pie-chart');
    $.plot('#pie-chart', pieData, {
        series: {
            pie: {
                show: true,
                radius: 1,
                label: {
                    show: true,
                    radius: 3/4,
                    formatter: labelFormatter,
                    background: {
                        opacity: 0.0,
                    }
                },
                
                stroke: { 
                    width: 2,
                }
            },
        },
        legend: {
            container: '.flc-pie',
            backgroundOpacity: 0.5,
            noColumns: 0,
            backgroundColor: "white",
            lineWidth: 0,
        },
        grid: {
            hoverable: true,
            clickable: true
        },
        tooltip: true,
        tooltipOpts: {
            content: "%s %p.0%  ", // show percentages, rounding to 2 decimal places
            shifts: {
                x: 20,
                y: 0
            },
            defaultTheme: false
        }
        
    });
    
    /* Donut Chart */

        $.plot('#parenting-donut-chart', parentingData, {
            series: {
                pie: {
                    innerRadius: 0.5,
                    show: true,
                    radius: 1,
                    label: {
                        show: true,
                        radius: 3/4,
                        formatter: labelFormatter,
                        background: {
                            opacity: 0.0,
                        }
                    },
                    stroke: { 
                        width: 2,
                    },
                },
            },
            legend: {
                container: '.flc-donut',
                backgroundOpacity: 0.5,
                noColumns: 0,
                backgroundColor: "white",
                lineWidth: 0
            },
            grid: {
                hoverable: true,
                clickable: true
            },
            tooltip: true,
            tooltipOpts: {
                content: "%p.0%, %s ", // show percentages, rounding to 2 decimal places
                shifts: {
                    x: 20,
                    y: 0
                },
                defaultTheme: false
            }
            
        });
        
        function labelFormatter(label, series) {
        	console.dir("series >>")
        	console.dir(series)
    		return "<div style='font-size:8pt; text-align:center; padding:2px; color:white;'>" + label + "<br/>" + Math.round(series.percent) + "%</div>";
    	}
       	
        
   
});